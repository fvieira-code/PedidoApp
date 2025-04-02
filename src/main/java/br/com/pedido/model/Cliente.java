package br.com.pedido.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cliente {

    @Id
    private Integer id;

    private String nomeCliente;
    private String tipoCliente; //enum
    private String documentoCliente;
    private String numeroCliente;

    private Endereco endereco;

}
