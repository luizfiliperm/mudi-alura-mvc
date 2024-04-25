package com.asaas.mudi.controllers;

import com.asaas.mudi.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping
    public String index(Model model){

        Order order1 = new Order();
        order1.setProductName("Clean Code");
        order1.setDescription("Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam unde porro dolores ipsa dolorem perferendis qui voluptas incidunt sunt minus, inventore totam assumenda corrupti velit voluptates molestiae dolorum doloribus molestias?");
        order1.setProductUrl("https://a.co/d/5CNysco");
        order1.setImgUrl("https://m.media-amazon.com/images/I/51E2055ZGUL._SL1000_.jpg");

        Order order2 = new Order();
        order2.setProductName("Clean Architecture");
        order2.setDescription("Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam unde porro dolores ipsa dolorem perferendis qui voluptas incidunt sunt minus, inventore totam assumenda corrupti velit voluptates molestiae dolorum doloribus molestias?");
        order2.setProductUrl("https://a.co/d/648OJal");
        order2.setImgUrl("https://m.media-amazon.com/images/I/619ht2WrGTL._SL1045_.jpg");

        List<Order> orders = Arrays.asList(order1, order2);
        model.addAttribute("orders", orders);
        return "index";
    }
}
