package com.asaas.mudi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String productName;

    private BigDecimal negotiatedValue;

    private LocalDate deliveryDate;

    private String productUrl;

    private String imgUrl;

    private String description;
}
