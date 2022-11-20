package br.com.casadogeladao.geladaoclientepedido.pedido.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.casadogeladao.geladaoclientepedido.pedido.domain.Pedido;

public interface PedidoSpringDataJPARepository extends JpaRepository <Pedido, UUID> {

}
