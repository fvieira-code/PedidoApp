package br.com.pedido.api;


import br.com.pedido.model.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PedidoService {

    @GetMapping("/pedidos")
    public List<Pedido> getAllPedidos();

    @GetMapping("/pedidos/{id}")
    public Pedido getPedido(@PathVariable("id") String id);

    @PostMapping("/pedidos")
    public Pedido postPedido(@RequestBody Pedido pedido);
}
