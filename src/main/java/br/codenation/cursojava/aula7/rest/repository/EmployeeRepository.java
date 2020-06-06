package br.codenation.cursojava.aula7.rest.repository;

import br.codenation.cursojava.aula7.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}