package br.com.casadogeladao.geladaoclientepedido.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.casadogeladao.geladaoclientepedido.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
}
