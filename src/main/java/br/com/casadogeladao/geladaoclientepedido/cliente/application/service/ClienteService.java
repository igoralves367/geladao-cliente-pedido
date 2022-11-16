package br.com.casadogeladao.geladaoclientepedido.cliente.application.service;

import java.util.List;

import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteListResponse;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteRequest;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
}
