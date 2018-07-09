package dao;

import java.util.ArrayList;
import java.util.List;

import domain.AudioBean;
import domain.BuyerBean;
import domain.ComputerBean;
import domain.ProductBean;
import domain.TvBean;
import serviceImpl.BuyServiceImpl;

public class BuyDAOImpl implements BuyDAO{
	public static BuyDAO instance = new BuyDAOImpl();
	BuyerBean buyer;
	List<ProductBean> list;
	public static BuyDAO getInstance() {
		return instance;
	}
	private BuyDAOImpl() {
		buyer = new BuyerBean();
		list = new ArrayList<>();
	}
	@Override
	public BuyerBean findBuyer() {
		return buyer;
	}

	@Override
	public void buy(ProductBean product) {
		list.add(product);
		
	}

	@Override
	public String buyResult() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProductBean> list() {
		return list;
	}
	@Override
	public String checkCart() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}

}
