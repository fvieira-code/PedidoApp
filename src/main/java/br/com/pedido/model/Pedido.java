package br.com.pedido.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Pedido {
    @Id
    private String id;

    private LocalDate dataPedido;
    private String situacaoPedido; //enum
    private String descricaoPedido;
    private Double totalPedido;

    public Pedido(){
    }
}
