package br.com.pedido.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Set;

@Data
public class Pedido {

    @Id
    private Integer id;
    private LocalDate dataPedido;
    private String situacaoPedido;
    private String descricaoPedido;
    private String totalPedido;

    private Cliente cliente;
    private Set<Pedido_Produto> pedido_produtos;

    public Pedido(){
    }
}
