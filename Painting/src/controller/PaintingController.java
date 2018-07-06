package controller;
import domain.*;
import javax.swing.JOptionPane;
import service.*;
import serviceImpl.*;

public class PaintingController {
	public static void main(String[] args) {
		
		while(true) {
			String select =JOptionPane.showInputDialog("0.종료, 1.Circle 2.Triangle 3.Result") ;
			switch(select) {
				case "0" : return;
				case "1" : 
					CircleBean c = new CircleBean();
					c.setR(JOptionPane.showInputDialog("반지름을 입력하시오."));
					c.setSpot(JOptionPane.showInputDialog("위치를 지정하세요."));
					ShapeServiceImpl.getInstance().list().add(0, c) ;
					break;
				case "2" : 
					TriangleBean t = new TriangleBean();
					t.setAngle(JOptionPane.showInputDialog("앵글을 입력하시오."));
					t.setSpot(JOptionPane.showInputDialog("위치를 지정하세요."));
					ShapeServiceImpl.getInstance().list().add(1, t);;
					break;
				case "3" : 
					
						JOptionPane.showMessageDialog(null, ShapeServiceImpl.getInstance().list());
				
					break;
				default : break;
			}
		}
}
}
