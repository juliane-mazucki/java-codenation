package br.codenation.cursojava.aula8.security.repository;

import br.codenation.cursojava.aula8.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}