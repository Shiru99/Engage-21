package ms.engage.myauthenticationservice.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ms.engage.myauthenticationservice.Model.CCSignupUser;

@Service
public class CCSignupUserService {

    private List<CCSignupUser> signupUsers = new ArrayList<>(
        Arrays.asList(
            
        )
    );

    public List<CCSignupUser> getAllSignupUsers() {
        return signupUsers;
    }

    public void addSignupUser(CCSignupUser signupUser) {
        signupUsers.add(signupUser);
    }

}
