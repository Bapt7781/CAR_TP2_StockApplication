package com.example.stockApplication;

import com.example.stockApplication.service.StockService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StockConsumer {

    private StockService stockService;

    public StockConsumer(StockService stockService) {
        this.stockService = stockService;
    }

    @KafkaListener(topics = "commandes-topic", groupId = "stock-group")
    public void ecouterCommandes(String message) {

        String[] parts = message.split(",");
        String nomArticle = parts[0];
        int quantite = Integer.parseInt(parts[1]);

        stockService.diminuerStock(nomArticle, quantite);
    }
}
