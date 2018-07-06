package controller;

import javax.swing.JOptionPane;

import domain.CardBean;
import service.*;
import serviceImpl.*;


//HEART,SPADE,CLOVER,DIAMON

public class CardController {
	public static void main(String[] args) {
	
		CardBean[] arr = null;
		while (true) {
			String select = JOptionPane.showInputDialog("0.종료 , 1.컴퓨터 카드 2. 내 카드 3.결과보기");
			switch (select) {
			case "0":
				return;
			case "1": 
				arr = new CardBean[2];
				arr[0] = CardServiceImpl.getInstance().showMyCard();
				break;
			case "2":
				arr[1] = CardServiceImpl.getInstance().showMyCard();
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, CardServiceImpl.getInstance().gamble(arr)); 
				break;
			default:
				break;
			}
		}
	}

}
