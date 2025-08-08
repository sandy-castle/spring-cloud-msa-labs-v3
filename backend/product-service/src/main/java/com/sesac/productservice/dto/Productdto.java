package com.sesac.productservice.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Productdto
{
   private Long id;
   private String name;
   private BigDecimal price;
   private Integer stockQuantity;
}
