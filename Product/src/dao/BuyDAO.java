package dao;

import java.util.List;

import domain.BuyerBean;
import domain.ProductBean;

public interface BuyDAO {
	public List<ProductBean> list();
	public void buy(ProductBean product);
	public String buyResult();
	public BuyerBean findBuyer(); 
	public String checkCart();
	public void refund();
}	
