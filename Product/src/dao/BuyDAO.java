package dao;

import java.util.List;

import domain.BuyerBean;
import domain.ProductBean;

public interface BuyDAO {
	public List<ProductBean> list();
	public void buy(ProductBean product);
	public String buyResult();
	public BuyerBean findBuyer(); 
	public int checkCart();
	public void refund();
	public void removeProduct(String check);
}	
