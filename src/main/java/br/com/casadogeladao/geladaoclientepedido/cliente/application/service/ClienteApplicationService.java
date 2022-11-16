package br.com.casadogeladao.geladaoclientepedido.cliente.application.service;

import org.springframework.stereotype.Service;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteRequest;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteResponse;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.repository.ClienteRepository;
import br.com.casadogeladao.geladaoclientepedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}
}