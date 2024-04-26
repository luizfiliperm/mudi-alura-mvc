package com.asaas.mudi.controllers;

import com.asaas.mudi.model.Order;
import com.asaas.mudi.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    private final OrderService orderService;

    public IndexController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ModelAndView index(){
        List<Order> orders = orderService.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("orders", orders);
        
        return mv;
    }
}
