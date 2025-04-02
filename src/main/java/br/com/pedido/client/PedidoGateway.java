package br.com.pedido.client;

import br.com.pedido.api.PedidoService;
import br.com.pedido.component.PedidoServerAlternate;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name="pedido-gateway",
        url = "http://localhost:8079/api",
        fallback = PedidoServerAlternate.class)
public interface PedidoGateway extends PedidoService {
}
