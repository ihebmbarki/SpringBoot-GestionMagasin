package tn.esprit.spring.service;
import java.util.List;

import tn.esprit.spring.entities.*;
public interface StockService {
	
	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);
}
