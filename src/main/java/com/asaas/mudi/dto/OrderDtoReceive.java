package com.asaas.mudi.dto;

import com.asaas.mudi.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDtoReceive {

    private String productName;
    private String productUrl;
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
