package com.asaas.mudi.controllers;

import com.asaas.mudi.model.Order;
import com.asaas.mudi.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    private final OrderService orderService;

    public IndexController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public ModelAndView index(@RequestParam(value = "status", required = false, defaultValue = "all") String status){
        List<Order> orders = orderService.findAllByStatus(status);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("orders", orders);
        mv.addObject("status", status);
        
        return mv;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError(){
        return "redirect:/";
    }
}
