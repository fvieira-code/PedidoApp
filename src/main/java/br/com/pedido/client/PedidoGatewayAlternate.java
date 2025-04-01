package br.com.pedido.client;

import br.com.pedido.api.PedidoService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "pedido-gateway-alternate",
        url = "http://localhost:8079/api")
public interface PedidoGatewayAlternate extends PedidoService {
}
