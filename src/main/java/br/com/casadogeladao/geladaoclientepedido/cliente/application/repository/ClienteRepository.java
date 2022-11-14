package br.com.casadogeladao.geladaoclientepedido.cliente.application.repository;

import br.com.casadogeladao.geladaoclientepedido.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
