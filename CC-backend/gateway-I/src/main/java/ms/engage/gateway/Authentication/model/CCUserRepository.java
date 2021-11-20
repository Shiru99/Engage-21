package ms.engage.gateway.Authentication.model;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CCUserRepository extends JpaRepository<CCUser,Integer> {
    Optional<CCUser> findByUsername(String username);
}