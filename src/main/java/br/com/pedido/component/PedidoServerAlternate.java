package br.com.pedido.component;

import br.com.pedido.client.PedidoGateway;
import br.com.pedido.client.PedidoGatewayAlternate;
import br.com.pedido.model.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@EnableFeignClients(basePackageClasses = PedidoGatewayAlternate.class)
@ComponentScan(basePackageClasses = PedidoGatewayAlternate.class)
@Component
public class PedidoServerAlternate implements PedidoGateway {

    Logger logger = LoggerFactory.getLogger(PedidoServerAlternate.class);

    private PedidoGatewayAlternate pedidoGatewayAlternate;

    @Autowired
    public PedidoServerAlternate(PedidoGatewayAlternate pedidoGatewayAlternate) {
        this.pedidoGatewayAlternate = pedidoGatewayAlternate;
    }

    @Override
    public List<Pedido> getAllPedidos() {
        logger.info("Consumindo o servidor de pedidos ...");
        return pedidoGatewayAlternate.getAllPedidos();
    }

    @Override
    public Pedido getPedido(String id) {
        logger.info("Consumindo o servidor de pedidos ...");
        return pedidoGatewayAlternate.getPedido(id);
    }

    @Override
    public Pedido postPedido(Pedido pedido) {
        logger.info("Salvando o servidor de pedidos ...");
        return pedidoGatewayAlternate.postPedido(pedido);
    }
}
