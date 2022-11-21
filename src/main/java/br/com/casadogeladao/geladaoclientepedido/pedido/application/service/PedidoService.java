package br.com.casadogeladao.geladaoclientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoClienteListResponse;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoRequest;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoResponse;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
	List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente);
}
