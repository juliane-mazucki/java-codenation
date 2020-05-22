package br.codenation.cursojava.aula6.controller;

import br.codenation.cursojava.aula6.model.Cargo;
import br.codenation.cursojava.aula6.model.Funcionario;
import br.codenation.cursojava.aula6.persistence.CargoRepository;
import br.codenation.cursojava.aula6.persistence.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AplicacaoController {

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping("/cargo")
    @ResponseStatus(HttpStatus.CREATED)
    public Cargo createCargo(@RequestBody Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    @PostMapping("/funcionario")
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @GetMapping("/cargo")
    public Iterable findAllCargos() {
        return cargoRepository.findAll();
    }

    @GetMapping("/funcionario")
    public Iterable findAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

}
