package com.sesac.orderservice.dto;

import lombok.Data;

public class OrderRequestDto
{
   @Data
   private Long productId;
   private Long userId;
   private Integer quantity;
}
