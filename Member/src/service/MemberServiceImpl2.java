package service;

import java.util.List;

import dao.*;
import domain.*;

public class MemberServiceImpl2 implements MemberService2{
	public static MemberService2 instance = new MemberServiceImpl2();
	public static MemberService2 getInstance() {return instance;}
	private MemberServiceImpl2() {}

	@Override
	public void createMember2(MemberBean2 member) {
		MemberDAOImpl2.getInstance().insertMember(member);
		
	}

	@Override
	public List<MemberBean2> memberList() {
	
		return MemberDAOImpl2.getInstance().selectAll(); }
	

	@Override
	public List<MemberBean2> findByMemberWord2(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findMemberById2(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyMember2(MemberBean2 member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember2(MemberBean2 member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean login(MemberBean2 member2) {
		return MemberDAOImpl2.getInstance().login(member2);
	}


}