package controller;

import javax.swing.JOptionPane;

import dao.BuyDAOImpl;
import domain.*;
import service.*;
import serviceImpl.*;

public class BuyController {
	public static void main(String[] args) {
		
		while(true) {
			String select = JOptionPane.showInputDialog("0. 종료  1. BUYER 입장  2. TV 3. COMPUTER 4.AUDIO 5. BUYER 잔고 6. REFUND 7. 장바구니 현황체크");
			switch(select) {
				case "0" : return;
				case "1" : 
					JOptionPane.showMessageDialog(null, "BUYER 입장");
					break;
				case "2" : 
					TvBean tv = new TvBean();
					BuyServiceImpl.getInstance().buy(tv);
					break ;
				case "3" : 
					ComputerBean com = new ComputerBean();
					BuyServiceImpl.getInstance().buy(com);
					break;
				case "4" : 
					AudioBean a = new AudioBean();
					BuyServiceImpl.getInstance().buy(a);
					break;
				case "5" : 
					JOptionPane.showMessageDialog(null, BuyServiceImpl.getInstance().buyResult());
					break;
				case "6" :
					BuyServiceImpl.getInstance().refund(JOptionPane.showInputDialog("환불하실 품목")+","+JOptionPane.showInputDialog("환불하실 개수"));
					
					break;
				case "7" :
					JOptionPane.showMessageDialog(null,BuyServiceImpl.getInstance().checkCart());
					break;
				default : break;
					
			}
		}

	}

}
