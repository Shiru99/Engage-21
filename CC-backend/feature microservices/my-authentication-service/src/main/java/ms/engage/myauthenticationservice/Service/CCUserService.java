package ms.engage.myauthenticationservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ms.engage.myauthenticationservice.Model.CCResponse;
import ms.engage.myauthenticationservice.Model.CCSignupUser;
import ms.engage.myauthenticationservice.Model.CCUser;
import ms.engage.myauthenticationservice.Repository.CCUserRepository;

@Service
public class CCUserService {

    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Autowired
    CCUserRepository ccUserRepository;

    public List<CCUser> getAllUsers() {
        System.out.println(ccUserRepository);
        return (List<CCUser>) ccUserRepository.findAll();
    }

    public CCResponse saveNewUser(CCSignupUser ccSignupUser) {

        Optional<CCUser> cCUser = ccUserRepository.findByUsername(ccSignupUser.getUsername());

        CCResponse response = new CCResponse();

        if (cCUser.isPresent()) {
            response.setStatus(false);
            response.setStatusMessage("User Already Exists, Please Login");
            return response;
        }

        CCUser user = new CCUser(ccSignupUser.getUsername(), passwordEncoder().encode(ccSignupUser.getPassword()),
                ccSignupUser.getRole());

        ccUserRepository.save(user);

        response.setStatus(true);
        response.setStatusMessage("User added successfully");
        return response;

    }

    public CCResponse loginUser(CCSignupUser ccSignupUser) {

        Optional<CCUser> cCUser = ccUserRepository.findByUsername(ccSignupUser.getUsername());
        CCResponse response = new CCResponse();

        if (!cCUser.isPresent()) {
            response.setStatus(false);
            response.setStatusMessage("User Doesn't Exist, Please SignUp first");
            return response;
        } else {
            CCUser currentUser = new CCUser(ccSignupUser.getUsername(),
                    passwordEncoder().encode(ccSignupUser.getPassword()), ccSignupUser.getRole());

            if (currentUser.equals(cCUser.get())) {
                if (passwordEncoder().matches(ccSignupUser.getPassword(), cCUser.get().getPassword())) {
                    response.setStatus(true);
                    response.setStatusMessage("Logged In successfully");
                    return response;
                }
            } else {
                response.setStatus(false);
                response.setStatusMessage("Please Enter correct Credentials (Role)");
                return response;
            }

            response.setStatus(false);
            response.setStatusMessage("Please Enter correct Credentials (Password)");
            return response;
        }

    }

}
