package br.codenation.cursojava.aula8.security.repository;

import br.codenation.cursojava.aula8.security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}