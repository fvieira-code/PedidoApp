package br.com.pedido.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
public class Pedido_Produto {

    @Id
    private Integer id;

    private String descricaoProduto;
    private String unidadeProduto;
    private Double quantidadeProduto;
    private BigDecimal valorProduto;
    private BigDecimal totalProduto;

}
