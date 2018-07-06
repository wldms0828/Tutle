package controller;

import javax.swing.JOptionPane;
import service.TvService;
import serviceImpl.*;
import domain.*;
public class TvController {
	public static void main(String[] args) {
		TvService s = new TvServiceImpl();
		
		while(true) {
			String select = JOptionPane.showInputDialog("0. POWER OFF, 1.POWER ON , 2.CHANNEL UP , 3.CHANNEL DOWN , 4.명령하기, 5.TV 정보 보여주기");
			
			switch(select) {
				case "0" : return;
				case "1" : 
					JOptionPane.showMessageDialog(null, "Tv가 켜졌습니다.");							
					break;
				case "2" :
					JOptionPane.showMessageDialog(null, s.channelUp());
					break;
				case "3" : 
					JOptionPane.showMessageDialog(null, s.channelDown());
					break;
				case "4" :
					s.text(JOptionPane.showInputDialog("프로그램명을 입력하시오"));
					break;
				case "5" : 
					JOptionPane.showMessageDialog(null, s.result());
					break;
				
			}
		}
	}
}
