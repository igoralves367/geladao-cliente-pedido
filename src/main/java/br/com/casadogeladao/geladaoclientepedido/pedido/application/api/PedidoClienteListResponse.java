package br.com.casadogeladao.geladaoclientepedido.pedido.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;
import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Sabor;
import lombok.Value;

@Value
public class PedidoClienteListResponse {
	private UUID idPedido;
	private Sabor sabor;
	private int quantidade;
	
	public static List<PedidoClienteListResponse> converte(List<Pedido> pedidosDoCliente) {
		return pedidosDoCliente.stream()
				.map(PedidoClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PedidoClienteListResponse(Pedido pedido) {
		this.idPedido = pedido.getIdClientePedido();
		this.sabor = pedido.getSabor();
		this.quantidade = pedido.getQuantidade();
	}
	
}
