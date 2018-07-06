package dao;

import domain.BuyerBean;
import domain.ProductBean;

public interface BuyDAO {
	public void buy(ProductBean product);
	public String buyResult();
	public BuyerBean findBuyer(); 
}	
