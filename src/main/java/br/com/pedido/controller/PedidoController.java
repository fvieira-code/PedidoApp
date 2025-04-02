package br.com.pedido.controller;

import br.com.pedido.api.PedidoService;
import br.com.pedido.client.PedidoGateway;
import br.com.pedido.client.PedidoGatewayAlternate;
import br.com.pedido.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@EnableFeignClients(basePackageClasses = PedidoGateway.class)
@ComponentScan(basePackageClasses = PedidoGateway.class)
@RequestMapping("/api")
public class PedidoController implements PedidoService {

    @Autowired
    private PedidoGateway pedidoGateway;

    @Autowired
    private PedidoGatewayAlternate pedidoGatewayAlternate;

    @Autowired
    public PedidoController(PedidoGateway pedidoGateway) {
        this.pedidoGateway = pedidoGateway;
    }

    @Override
    @GetMapping("/pedidos")
    public List<Pedido> getAllPedidos() {
        try {
            return pedidoGateway.getAllPedidos();
        } catch (Exception e){
            return pedidoGatewayAlternate.getAllPedidos();
        }
    }

    @Override
    @GetMapping("/pedidos/{id}")
    public Pedido getPedido(@PathVariable("id") String id) {
        try {
            return pedidoGateway.getPedido(id);
        } catch (Exception e){
            return pedidoGatewayAlternate.getPedido(id);
        }
    }

    @PostMapping("/pedidos")
    public Pedido postPedido(@RequestBody Pedido pedido) {
        try {
            return pedidoGateway.postPedido(pedido);
        } catch (Exception e){
            return pedidoGatewayAlternate.postPedido(pedido);
        }
    }
}
