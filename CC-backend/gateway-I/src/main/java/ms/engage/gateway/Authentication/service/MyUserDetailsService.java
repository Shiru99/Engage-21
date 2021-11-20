package ms.engage.gateway.Authentication;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ms.engage.gateway.Authentication.model.CCUser;
import ms.engage.gateway.Authentication.model.CCUserRepository;
import ms.engage.gateway.Authentication.model.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    CCUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<CCUser> cc_user = userRepository.findByUsername(username);

        if (cc_user.isEmpty())
            throw new UsernameNotFoundException("Not Found : " + username);
        else
            return new MyUserDetails(cc_user.get());
    }

}