package br.com.casadogeladao.geladaoclientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.casadogeladao.geladaoclientepedido.cliente.application.service.ClienteService;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoClienteDetalhadoResponse;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoClienteListResponse;
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

	@Override
	public List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente) {
		log.info("[inica] PedidoApplicationService - buscaPedidosDoClienteComId");
	    clienteService.buscaClienteAtravesId(idCliente);
	    List<Pedido> pedidosDoCliente = pedidoRepository.buscaPedidosDoClienteComId(idCliente);
	    log.info("[finaliza] PedidoApplicationService - buscaPedidosDoClienteComId");
	  	return PedidoClienteListResponse.converte(pedidosDoCliente);
	}

	@Override
	public PedidoClienteDetalhadoResponse buscaPedidoDoClienteComId(UUID idCliente, UUID idPedido) {
		log.info("[inica] PedidoApplicationService - buscaPedidoDoClienteComID");
	    clienteService.buscaClienteAtravesId(idCliente);
	    Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);	 
	    log.info("[finaliza] PedidoApplicationService - buscaPedidoDoClienteComID");
		return new PedidoClienteDetalhadoResponse(pedido);
	}

	@Override
	public void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
		log.info("[inica] PedidoApplicationService - deletaPedidoDoClienteComID");
	    clienteService.buscaClienteAtravesId(idCliente);
	    Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);
	    pedidoRepository.deletaPedido(pedido);
	    log.info("[finaliza] PedidoApplicationService - deletaPedidoDoClienteComID");
	}

}
