package controller;

import java.awt.List;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.StarcraftServiceImpl;


public class StarcraftController {
	public static void main(String[] args) {	
	StarcraftService service = new StarcraftServiceImpl();	
	while(true) {
		String select = JOptionPane.showInputDialog("0.종료 , 1.Dropship ,2.Marine, 3.SCV, 4.Tank 5.목록보기") ;
		switch(select) {
			case "0" : return;
			case "1" : 
				DropshipBean d = new DropshipBean();
				d.setSpace(JOptionPane.showInputDialog("공간"));
				d.setHp(JOptionPane.showInputDialog("체력"));
				d.setHitpoint(JOptionPane.showInputDialog("타격점"));
				d.setPilot(JOptionPane.showInputDialog("파일럿"));
				service.listUnit().add(0, d);
					break;
			case "2" : 
				MarineBean m = new MarineBean();
				m.setGun(JOptionPane.showInputDialog("총"));
				m.setHitpoint(JOptionPane.showInputDialog("타격점"));
				m.setHp(JOptionPane.showInputDialog("체력"));
				m.setName(JOptionPane.showInputDialog("이름"));
				service.listUnit().add(1, m); 
				break;
			case "3" : 
				SCVBean s = new SCVBean();
				s.setHitpoint(JOptionPane.showInputDialog("타격점"));
				s.setHp(JOptionPane.showInputDialog("체력"));
				s.setMineral(JOptionPane.showInputDialog("미네랄"));
				s.setName(JOptionPane.showInputDialog("이름"));
				service.listUnit().add(2, s); 
				break;
			case "4" : 
				TankBean t = new TankBean();
				t.setCannon(JOptionPane.showInputDialog("캐논"));
				t.setHitpoint(JOptionPane.showInputDialog("타격점"));
				t.setHp(JOptionPane.showInputDialog("체력"));
				t.setName(JOptionPane.showInputDialog("이름"));
				service.listUnit().add(3, t);
				break;
			case "5" : 
			
					System.out.println(service.listUnit());
				
				      break;
			default : break;
				
		}
	}
}
}

