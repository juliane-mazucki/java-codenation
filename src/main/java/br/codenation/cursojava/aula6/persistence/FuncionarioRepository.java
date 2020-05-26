package br.codenation.cursojava.aula6.persistence;

import br.codenation.cursojava.aula6.model.Cargo;
import br.codenation.cursojava.aula6.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query("SELECT f FROM Funcionario f WHERE f.cargo = :cargo")
    List<Funcionario> findAllByCargo(@Param("cargo") Cargo cargo);

    @Query(value = "SELECT * FROM funcionario f WHERE f.fk_cargo_id = :cargoId", nativeQuery = true)
    List<Funcionario> findAllByCargoNative(@Param("cargoId") Long cargoId);

    Funcionario findFuncionarioByCargo(Cargo cargo);

    List<Funcionario> findByCargoOrderByNome(Cargo cargo);

    List<Funcionario> findByNomeLike(String nome);
}
