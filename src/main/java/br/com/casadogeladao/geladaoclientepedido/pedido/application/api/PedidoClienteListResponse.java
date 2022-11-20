package br.com.casadogeladao.geladaoclientepedido.pedido.application.api;

import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Sabor;
import lombok.Value;
@Value
public class PedidoClienteListResponse {
	private Sabor sabor;
	private int quantidade;


}
