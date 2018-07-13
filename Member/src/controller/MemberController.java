package controller;

import javax.swing.JOptionPane;
import domain.*;
import dao.*;
import service.*;

public class MemberController {

	public static void main(String[] args) {
		
		while(true) {
			String select = JOptionPane.showInputDialog("0.종료 1.회원가입 2.로그인 3.비밀번호 변경");
			switch(select) {
				case "0" : return;
				case "1" : 
					MemberBean member = new MemberBean();
					member.setId(JOptionPane.showInputDialog("ID를 입력하세요"));
					member.setPass(JOptionPane.showInputDialog("PASS를 입력하세요"));
					member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
					member.setAge(JOptionPane.showInputDialog("나이를 입력하세요"));
					member.setGender(JOptionPane.showInputDialog("성별을 입력하세요"));
					MemberServiceImpl.getInstance().createMember(member);
					break;
				case "2" :
					boolean flag = false;
					MemberBean member2 = new MemberBean();
					member2.setId(JOptionPane.showInputDialog("ID를 입력하세요"));
					member2.setPass(JOptionPane.showInputDialog("PASS를 입력하세요"));
					flag = MemberServiceImpl.getInstance().loginMember(member2);
					System.out.println(flag);
					if(flag) {
						JOptionPane.showMessageDialog(null, "성공");
					}else {
						JOptionPane.showMessageDialog(null, "실패");
					}
					break;
				case "3" : 
					MemberBean member3 = new MemberBean();
					member3.setId(JOptionPane.showInputDialog("ID를 입력하세요"));
					member3.setPass(JOptionPane.showInputDialog("PASS를 입력하세요")
									+"/"+JOptionPane.showInputDialog("변경하실 PASS를 입력하세요"));
					JOptionPane.showMessageDialog(null, MemberServiceImpl.getInstance().updatePass(member3));
					break;
					
			}
		}
	}

}
