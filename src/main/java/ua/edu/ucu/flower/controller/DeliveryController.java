package ua.edu.ucu.flower.controller;


import ua.edu.ucu.flower.delivery.Delivery;
import ua.edu.ucu.flower.delivery.PostalDeliveryStrategy;
import ua.edu.ucu.flower.delivery.DHLDeliveryStrategy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    
    @GetMapping("/postal")
    public double deliverByPostal(@RequestParam double orderPrice) {
        Delivery delivery = new PostalDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }

    @GetMapping("/dhl")
    public double deliverByDHL(@RequestParam double orderPrice) {
        Delivery delivery = new DHLDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }

}
