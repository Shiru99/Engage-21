package ms.engage.myauthenticationservice.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ms.engage.myauthenticationservice.Model.CCUser;

@Repository
public interface CCUserRepository extends JpaRepository<CCUser,Integer> {
    Optional<CCUser> findByUsername(String username);
}