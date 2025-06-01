package br.com.fat.delivery.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fat.delivery.model.Order;


public class OrderRepository extends JpaRepository<Order, Long> {

    public Order save(Order order) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
