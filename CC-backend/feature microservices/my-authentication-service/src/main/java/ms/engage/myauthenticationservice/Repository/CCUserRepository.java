package ms.engage.myauthenticationservice.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ms.engage.myauthenticationservice.Model.CCUser;

@Repository
public interface CCUserRepository extends CrudRepository<CCUser,Integer> {
    Optional<CCUser> findByUsername(String username);
}