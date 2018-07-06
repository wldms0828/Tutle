package dao;

import domain.CardBean;

public class CardDAOImpl implements CardDAO {
	public static CardDAO instance = new CardDAOImpl();

	public static CardDAO getInstance() {
		return instance;
	}
	private CardDAOImpl() {}

	@Override
	public String kindRandom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardBean showMyCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numberRandom() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String gamble(CardBean[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

}
