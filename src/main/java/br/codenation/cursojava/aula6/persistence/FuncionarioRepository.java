package br.codenation.cursojava.aula6.persistence;

import br.codenation.cursojava.aula6.model.Cargo;
import br.codenation.cursojava.aula6.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByCargo(Cargo cargo);

    List<Funcionario> findByNomeLike(String nome);


}
