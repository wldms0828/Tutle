package service;
import java.util.List;

import domain.*;

public interface BuyService {
	public void buy(ProductBean product);
	public String buyResult();
	public List<ProductBean> buyList();
	public List<ProductBean> checkCart(String check);
	public void refund(String re);


}
