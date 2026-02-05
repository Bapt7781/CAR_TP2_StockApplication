package com.example.stockApplication.ctrl;

import com.example.stockApplication.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stock/home")
    public String index(Model model) {
        model.addAttribute("articles", stockService.getStock());
        return "stock";
    }

    @PostMapping("/restock")
    public String reStock() {
        stockService.reStock();
        return "redirect:/stock/home";
    }
}