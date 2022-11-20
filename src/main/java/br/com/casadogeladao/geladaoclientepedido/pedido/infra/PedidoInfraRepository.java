package br.com.casadogeladao.geladaoclientepedido.pedido.infra;

import org.springframework.stereotype.Repository;

import br.com.casadogeladao.geladaoclientepedido.pedido.application.service.PedidoRepository;
import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
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

}
