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
	public String checkCart() {
		List<ProductBean> cart = buyList(); 
		int com = 0;
		int audio = 0;
		int tv =0;
		for(int i =0;i<cart.size();i++) {
			if(cart.get(i) instanceof TvBean) {
				tv++;
			}else if(cart.get(i) instanceof ComputerBean){
				com++;
			}else {
				audio++;
			}
		}
		return "tv" + tv + "com"+ com + "audio" + audio;
	}
	@Override
	public void refund(String re) {
		String[] arr = re.split(",");
		List<ProductBean> refund = buyList();
		int recount=0;
		for(int i =0;i<refund.size();i++) {
			if(recount == Integer.parseInt(arr[1])) {
				break;
			}else if(arr[0].equals("컴퓨터")&&refund.get(i) instanceof ComputerBean ) {
				refund.remove(i);
				BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney()+50);
				recount++;
			}else if(arr[0].equals("TV")&&refund.get(i) instanceof TvBean){
				refund.remove(i);
				BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney()+100);
				recount++;
			}else if(arr[0].equals("오디오") && refund.get(i) instanceof AudioBean) {
				refund.remove(i);
				BuyDAOImpl.getInstance().findBuyer().setMoney(BuyDAOImpl.getInstance().findBuyer().getMoney()+10);
				recount++;
			}
		}
		
		
	}



}
