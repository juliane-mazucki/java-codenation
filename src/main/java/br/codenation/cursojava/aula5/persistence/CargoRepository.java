package br.codenation.cursojava.aula6.persistence;

import br.codenation.cursojava.aula6.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
