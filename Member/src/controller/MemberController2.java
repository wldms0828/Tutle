package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.MemberServiceImpl;
import service.MemberServiceImpl2;
public class MemberController2 {
	public static void main(String[] args) {
		while(true) {
			String select = JOptionPane.showInputDialog("0.종료 1.회원가입 2.로그인 3.멤버리스트");
			switch(select) {
				case "0" : return;
				case "1" :
					MemberBean2 mem = new MemberBean2();
					mem.setName(JOptionPane.showInputDialog("이름을 입력하시오."));
					mem.setAge(JOptionPane.showInputDialog("나이를 입력하시오."));
					mem.setId(JOptionPane.showInputDialog("ID를 입력하시오."));
					mem.setPass(JOptionPane.showInputDialog("PASS를 입력하시오."));
					mem.setGender(JOptionPane.showInputDialog("성별을 입력하시오."));
					MemberServiceImpl2.getInstance().createMember2(mem);
					break;
				case "2" :
					boolean flag = false;
					MemberBean2 mem2 = new MemberBean2();
					mem2.setId(JOptionPane.showInputDialog("ID를 입력하시오"));
					mem2.setPass(JOptionPane.showInputDialog("PASS를 입력하시오"));
					flag = MemberServiceImpl2.getInstance().login(mem2);
					if(flag) {
						JOptionPane.showMessageDialog(null, "성공");
					}else {
						JOptionPane.showMessageDialog(null, "실패");
					}
			
					break;
				case "3" :
					
					JOptionPane.showMessageDialog(null, MemberServiceImpl2.getInstance().memberList());
					break;
				
			}
		}
	}
}