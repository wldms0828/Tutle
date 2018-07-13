package dao;

import java.util.*;

import javax.swing.JOptionPane;

import domain.*;

public class MemberDAOImpl implements MemberDAO{
	Map<String,Object> map ;
	public static MemberDAO instance = new MemberDAOImpl(); 
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}
	List<MemberBean> list ;
	
	@Override
	public void  insertMember(MemberBean mem) {
		list.add(mem);
		map.put(mem.getId(), mem);		
	}

	@Override
	public List<MemberBean> memberList() {
		return list;
	}

	@Override
	public List<MemberBean> selectName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyMember(MemberBean mem) {
		
		
	}

	@Override
	public void deleteMember(MemberBean mem) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean loginMember(MemberBean member) {
		System.out.println("ID : " +member.getId() + "PASS" + member.getPass());
		boolean flag1 = false;
		MemberBean mem = (MemberBean) map.get(member.getId());
		System.out.println("memID:"+mem.getId()+"memPASS:"+mem.getPass());
		if(mem.getId().equals(member.getId()) && mem.getPass().equals(member.getPass())) {
			flag1 = true;
		}else {
			flag1 = false;
		}
		
		return flag1;
	}
	@Override
	public String updatePass(MemberBean mem) {
		String oldPass = mem.getPass().split("/")[0];
		String newPass = mem.getPass().split("/")[1];
		String rs = "";
		MemberBean member = (MemberBean) map.get(mem.getId());
		if(oldPass.equals(member.getPass())) {
			member.setPass(newPass);
			map.put(member.getId(), member);
			rs = "변경성공";
		}else {
			rs = "변경실패";
		}	
		return rs;
	}

}
