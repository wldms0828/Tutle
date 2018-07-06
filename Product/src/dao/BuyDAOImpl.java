package dao;

import domain.BuyerBean;
import domain.ProductBean;

public class BuyDAOImpl implements BuyDAO{
	public static BuyDAO instance = new BuyDAOImpl();
	BuyerBean buyer;

	public static BuyDAO getInstance() {
		return instance;
	}
	private BuyDAOImpl() {
		buyer = new BuyerBean();

	}
	@Override
	public BuyerBean findBuyer() {
		return buyer;
	}

	@Override
	public void buy(ProductBean product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String buyResult() {
		// TODO Auto-generated method stub
		return null;
	}

}
