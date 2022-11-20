package br.com.casadogeladao.geladaoclientepedido.pedido.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoRequest;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PedidoApplicationService implements PedidoService {

	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[inica] PedidoApplicationService - criaPedido");
		
		log.info("[finaliza] PedidoApplicationService - criaPedido");
		return null;
	}

}
