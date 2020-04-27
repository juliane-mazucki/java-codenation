package br.codenation.cursojava.aula2.CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploMapas {

    public static void main(String[] args) {

        Map<Long, Cliente> clientes = new HashMap<>();

        // Leituras vindas de um arquivo
        List<Leitura> leituras = new ArrayList<>();

        for (Leitura l : leituras) {

            // Imaginem que buscamos do banco com l.getUnidadeConsumidora()
            UnidadeConsumidora uc = new UnidadeConsumidora();

            Cliente cliente;

            if (clientes.containsKey(uc.getIdCliente())) {
                cliente = clientes.get(uc.getIdCliente());
            } else {
                // Busca o cliente no banco com uc.getIdCliente()
                cliente = new Cliente();

                clientes.put(uc.getIdCliente(), cliente);
                clientes.put(uc.getIdCliente(), new Cliente());
            }


        }

        Set<Cliente> setClientes = new HashSet<>();

        Cliente cliente1 = new Cliente(1L, "Ana");
        setClientes.add(cliente1);
        setClientes.add(cliente1);
        Cliente cliente3 = new Cliente(2L, "Carlos");
        setClientes.add(cliente3);
        Cliente cliente4 = new Cliente(3L, "Paula");
        setClientes.add(cliente4);

        for(Cliente c: setClientes) {
            System.out.println(c.getId() + " - " + c.getNome());
        }

    }

}
