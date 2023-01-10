package br.com.casadogeladao.geladaoclientepedido.cliente.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.casadogeladao.geladaoclientepedido.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {

}
