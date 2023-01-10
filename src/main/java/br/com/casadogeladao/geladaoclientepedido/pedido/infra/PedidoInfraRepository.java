package br.com.casadogeladao.geladaoclientepedido.pedido.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.casadogeladao.geladaoclientepedido.handler.APIException;
import br.com.casadogeladao.geladaoclientepedido.pedido.application.service.PedidoRepository;
import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.var;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PedidoInfraRepository implements PedidoRepository {
	private final PedidoSpringDataJPARepository pedidoSpringDataJPARepository; 

	@Override
	public Pedido salvaPedido(Pedido pedido) {
		log.info("[inicia] PedidoInfraRepository - salvaPedido");
		pedidoSpringDataJPARepository.save(pedido);
		log.info("[finaliza] PedidoInfraRepository - salvaPedido");
		return pedido;
	}

	@Override
	public List<Pedido> buscaPedidosDoClienteComId(UUID idCliente) {
		log.info("[inicia] PedidoInfraRepository - buscaPedidosDoClienteComId");
		var pedidos = pedidoSpringDataJPARepository.findByIdClientePedido(idCliente);
		log.info("[finaliza] PedidoInfraRepository - buscaPedidosDoClienteComId");
		return pedidos;		
	}

	@Override
	public Pedido buscaPedidoPeloId(UUID idPedido) {
		log.info("[inicia] PedidoInfraRepository - buscaPedidoPeloId");
		var pedido = pedidoSpringDataJPARepository.findById(idPedido)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pedido não encontrado para IdPedido =" + idPedido));
		log.info("[finaliza] PedidoInfraRepository - buscaPedidoPeloId");
		return pedido;
	}

	@Override
	public void deletaPedido(Pedido pedido) {
		log.info("[inicia] PedidoInfraRepository - deletaPedido");
		pedidoSpringDataJPARepository.delete(pedido);
		log.info("[finaliza] PedidoInfraRepository - deletaPedido");
		
	}

}
