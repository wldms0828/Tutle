package dao;

import domain.CardBean;

public interface CardDAO {
	public String kindRandom();
	public CardBean showMyCard();
	public int numberRandom();
	public String gamble(CardBean[] arr);
}
