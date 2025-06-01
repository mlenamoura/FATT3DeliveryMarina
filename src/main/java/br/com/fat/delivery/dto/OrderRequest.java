package br.com.fat.delivery.dto;
import lombok.Data;
import javax.validation.constraints.*; 
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Data
public class OrderRequest {
    @NotBlank 
    private String customerName; 
    @NotNull 
    @DecimalMin("0.0") 
    private BigDecimal totalAmount; 
}
