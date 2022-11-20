package br.com.casadogeladao.geladaoclientepedido.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteAlteraçãoRequest;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteDetalhadoResponse;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteListResponse;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteRequest;
import br.com.casadogeladao.geladaoclientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void delataClienteAtravesId(UUID idCliente);
	void pathAlteraCliente(UUID idCliente, ClienteAlteraçãoRequest clienteAlteracaoRequest);
}
