package com.lucas.hardwarestore.dto.product;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductRequestData {
    private String name;
    private String brand;
    private BigDecimal price;
}
