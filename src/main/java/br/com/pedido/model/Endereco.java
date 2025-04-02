package br.com.pedido.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Endereco {

    @Id
    private Integer id;

    private String ruaEndereco; //enum PRINCIPAL - SECUNDARIO
    private String numeroEndereco;
    private String bairroEndereco;
    private String cepEndereco;
    private String cidadeEndereco;
    private String ufEndereco; //Enum

}
