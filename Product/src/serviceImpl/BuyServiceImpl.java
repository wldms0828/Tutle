package serviceImpl;
import java.util.List;

import dao.BuyDAOImpl;
import domain.*;
import service.BuyService;

public class BuyServiceImpl implements BuyService {
	public static BuyService instance = new BuyServiceImpl();
	public static BuyService getInstance() {return instance;}
	private BuyServiceImpl() {}
	
	@Override
	public void buy(ProductBean product) {
 
		BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney() - product.getPrice());
		BuyDAOImpl.getInstance().buy(product);
	}
	@Override
	public String buyResult() {
		String res = String.valueOf(BuyDAOImpl.getInstance().findBuyer().getMoney());
		
		return res;
	}
	@Override
	public List<ProductBean> buyList() {
		return BuyDAOImpl.getInstance().list();
	}
	@Override
	public List<ProductBean> checkCart(String check) {
		List<ProductBean> cart
		= BuyDAOImpl.getInstance().list(); 
		String result = "";
		for(int i =0;i<cart.size();i++) {
			if(cart.get(i).getName().equals(check)) {
				BuyDAOImpl.getInstance().list().remove(i);
				
			}
		}
		System.out.println(result);
		return cart;
	}
	@Override
	public void refund(String re) {
					
			if(re.equals("컴퓨터")) {
				
				BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney()+50);
				
			}else if(re.equals("TV")){
				
				BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney()+100);
				
			}else if(re.equals("오디오")) {
			
				BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney()+10);
				
			}
		
		
	}



}
