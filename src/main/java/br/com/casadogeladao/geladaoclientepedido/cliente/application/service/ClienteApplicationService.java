package br.com.casadogeladao.geladaoclientepedido.cliente.application.service;

import org.springframework.stereotype.Service;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteRequest;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
