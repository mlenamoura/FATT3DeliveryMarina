package br.com.fat.delivery.service;
import org.springframework.stereotype.Service; 
import br.com.fat.delivery.repository.OrderRepository;
import br.com.fat.delivery.model.Order;
import br.com.fat.delivery.dto.OrderDTO;
import br.com.fat.delivery.dto.OrderRequest;
import org.modelmapper.ModelMapper; 

import java.time.LocalDateTime;

@Service
public class OrderService {
private final OrderRepository repo;
public OrderService(OrderRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
      public OrderDTO createOrder(OrderRequest req) {
        Order order = new Order(); 
        order.setCustomerName(req.getCustomerName());
        order.setTotalAmount(req.getTotalAmount());
        order.setCreatedAt(LocalDateTime.now()); 
       
        Order saved = repo.save(order);

       
        return mapper.map(saved, OrderDTO.class);
      }

}
