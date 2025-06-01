package br.com.fat.delivery.model;
import lombok.Data; 
import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity 
@Table(name = "orders") 
@Data 
public class Order {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private BigDecimal totalAmount; 

    private LocalDateTime createdAt; 
    
}
