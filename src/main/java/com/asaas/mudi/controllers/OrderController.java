package com.asaas.mudi.controllers;

import com.asaas.mudi.dto.OrderDtoReceive;
import com.asaas.mudi.services.OrderService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/form")
    public String form(OrderDtoReceive orderDtoReceive){
        return "order/form";
    }

    @PostMapping("/new")
    public String newOrder(@Valid OrderDtoReceive orderDtoReceive, BindingResult result){

        if(result.hasErrors()){
            return "order/form";
        }

        orderService.save(orderDtoReceive.toOrder());
        return "redirect:/";
    }
}
