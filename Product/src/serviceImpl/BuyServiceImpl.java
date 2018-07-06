package serviceImpl;
import dao.BuyDAOImpl;
import domain.*;
import service.BuyService;

public class BuyServiceImpl implements BuyService {
	
	public static BuyService instance = new BuyServiceImpl();
	
	public static BuyService getInstance() {
		return instance;
	}
	private BuyServiceImpl() {}
	@Override
	public void buy(ProductBean product) {

		BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney() - product.getPrice());
	}
	@Override
	public String buyResult() {
		String res = String.valueOf(BuyDAOImpl.getInstance().findBuyer().getMoney());
		
		return res;
	}



}
