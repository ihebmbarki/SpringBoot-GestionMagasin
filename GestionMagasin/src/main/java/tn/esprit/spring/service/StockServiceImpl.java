package tn.esprit.spring.service;
import tn.esprit.spring.entities.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.repository.*;

@Service
public class StockServiceImpl {
	@Autowired
	StockRepository sr;
	
	
	 public List <Stock> retrieveAllStocks() {
	        List<Stock> stocks = new ArrayList<>();
	        sr.findAll();
	        return stocks;
	    }
	 Stock addStock(Stock s){
	    	return sr.save(s);
	    	}
	 Stock updateStock(Stock u){
	    	return sr.save(u);
	    	}
	 Stock retrieveStock(Long id){
			return sr.findById(id).get();
		}
	
}
