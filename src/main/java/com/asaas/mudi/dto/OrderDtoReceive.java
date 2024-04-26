package com.asaas.mudi.dto;

import com.asaas.mudi.model.Order;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDtoReceive {

    @NotBlank
    private String productName;

    @NotBlank
    private String productUrl;

    @NotBlank
    private String imgUrl;
    
    private String description;

    public Order toOrder(){
        Order order = new Order();
        order.setProductName(productName);
        order.setProductUrl(productUrl);
        order.setImgUrl(imgUrl);
        order.setDescription(description);
        return order;
    }
}
