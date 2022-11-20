package br.com.casadogeladao.geladaoclientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
	List<Pedido> buscaPedidosDoClienteComId(UUID idCliente);
}
