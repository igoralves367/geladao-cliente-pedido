package br.com.casadogeladao.geladaoclientepedido.cliente.application.service;

import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteRequest;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
