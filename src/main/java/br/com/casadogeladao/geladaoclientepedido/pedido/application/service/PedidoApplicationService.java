package br.com.casadogeladao.geladaoclientepedido.pedido.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.casadogeladao.geladaoclientepedido.cliente.application.service.ClienteService;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoRequest;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoResponse;
import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {
	private final ClienteService clienteService;
	private final PedidoRepository pedidoRepository;

	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[inica] PedidoApplicationService - criaPedido");
		clienteService.buscaClienteAtravesId(idCliente);
		Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
		log.info("[finaliza] PedidoApplicationService - criaPedido");
		return new PedidoResponse(pedido.getIdPedido());
	}

}
