package br.codenation.cursojava.aula8.security.repository;

import br.codenation.cursojava.aula8.security.model.Permission;
import br.codenation.cursojava.aula8.security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    List<Permission> findByUsers(Users user);
}