package br.codenation.cursojava.aula7.beanvalidation.repository;

import br.codenation.cursojava.aula7.beanvalidation.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
