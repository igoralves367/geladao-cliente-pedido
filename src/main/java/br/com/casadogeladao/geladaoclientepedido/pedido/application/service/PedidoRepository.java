package br.com.casadogeladao.geladaoclientepedido.pedido.application.service;

import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);

}
