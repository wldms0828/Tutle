package serviceImpl;

import domain.*;
import service.*;

public class CardServiceImpl implements CardService {
	public static CardService instance = new CardServiceImpl();
	public static CardService getInstance() {
		return instance;
	}
	private CardServiceImpl() {}
	@Override
	public String kindRandom() {
		String kind = null;
		String[] arr = new String[4];
		arr[0] = "HEART";
		arr[1] = "SPADE";
		arr[2] = "CLOVER";
		arr[3] = "DIAMON";
		
		int i = (int)(Math.random()*4);
		System.out.println("랜덤숫자"+i);
		kind = arr[i];
		return kind;
	}
	public CardBean showMyCard() {
		CardBean card =new CardBean();
		card.setKind(kindRandom());
		card.setNumber(numberRandom());
		return card;
	}
	@Override
	public int numberRandom() {
	int n = (int)(Math.random()*14);
	System.out.println("랜덤숫자 : " + n);
		return n;
	}
	@Override
	public String gamble(CardBean[] arr) {
		String result = "";
		if(arr[0].getNumber() > arr[1].getNumber()) {
			result = "컴퓨터 승" ;
		}else if(arr[0].getNumber() < arr[1].getNumber()) {
			result = "사용자 승";
		}else {
			result = "무승부";
		}
		return result;
	}

}
