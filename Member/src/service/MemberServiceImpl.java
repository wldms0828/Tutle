package service;

import java.util.List;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	public static MemberService instance = new MemberServiceImpl(); 
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	@Override
	public void createMember(MemberBean mem) {
		
		MemberDAOImpl.getInstance().insertMember(mem);
		
	}

	@Override
	public List<MemberBean> memberList() {
		
		return MemberDAOImpl.getInstance().memberList();
	}

	@Override
	public List<MemberBean> findByName(String name) {
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
	public void updateMemeber(MemberBean mem) {
	
	}

	@Override
	public void deleteMember(MemberBean mem) {
		
		
	}
	@Override
	public boolean loginMember(MemberBean member) {
		return MemberDAOImpl.getInstance().loginMember(member);
	}
	@Override
	public String updatePass(MemberBean mem) {
		
		return MemberDAOImpl.getInstance().updatePass(mem);
	}

}
