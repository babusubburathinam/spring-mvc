package com.controller;

import com.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

@Controller
@RequestMapping({"/order"})
public class OrderController
{

    // accessed with http://localhost:8080/order/new
    @RequestMapping(value="/new", method = RequestMethod.GET)
    public String initNewRequest(Model model)
    {
        Order order = new Order();
        model.addAttribute("orderModel", order);
        return "orderView";
    }

    // accessed with http://localhost:8080/order/edit/1
    @RequestMapping(value="/edit/{orderKey}", method = RequestMethod.GET)
    public String initNewRequest(
        @PathVariable Long orderKey,
        Model model
    )
    {
        Order order = getOrder(orderKey); // A simulation of a db look up
        model.addAttribute("orderModel", order);
        return "orderView";
    }

    private Order getOrder(Long key)
    {
        Order order = new Order();
        order.setInitiatingUserId(key.toString());
        order.setKey(key);
        order.setValue(new BigDecimal(key));
        return order;
    }

    // Handles form submissions
    @RequestMapping(value="/persist", method = RequestMethod.POST)
    public String persistOrder(Order order)
    {
        System.out.println(order);
        if ( null == order.getKey() )
        {
            // order is new
        }
        else
        {
            // existing order is bring updated
        }
        return "saveMessage";
    }

}
