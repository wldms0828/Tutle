package service;
import domain.*;
import serviceImpl.*;
public interface CardService{
	public String kindRandom();
	public CardBean showMyCard();
	public int numberRandom();
	public String gamble(CardBean[] arr);

}
