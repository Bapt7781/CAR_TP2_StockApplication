package com.example.stockApplication.service;

import com.example.stockApplication.entity.Article;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private final List<Article> stock = new ArrayList<>();

    public StockService() {
        stock.add(new Article("Chaise", 5));
        stock.add(new Article("Table", 3));
    }

    public List<Article> getStock() {
        return stock;
    }

    public void reStock() {
        for (Article article : stock) {
            if ("Chaise".equals(article.getLibelle())) {
                article.setQuantite(article.getQuantite() + 2);
            } else if ("Table".equals(article.getLibelle())) {
                article.setQuantite(article.getQuantite() + 1);
            }
        }
    }
}