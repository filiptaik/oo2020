package com.filip.kodutoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @GetMapping("/price")
    public String eurExchange(@RequestParam(value = "value", defaultValue = "0") String value,
                              @RequestParam(value = "amount", defaultValue = "0") double amount, Model model){


        model.addAttribute("value", value);
        model.addAttribute("amount", amount);

        double sum;

        switch (value){
            case "eur":
                sum = amount * 0.92;
                break;
            case "usd":
                sum = amount * 1.08;
                break;
            default:
                sum = 0;
        }

        model.addAttribute("sum", sum);
        return "price";
        //return String.format("Saad %.2f %s", sum, value);

    }

}
