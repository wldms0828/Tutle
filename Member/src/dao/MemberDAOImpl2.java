package dao;

import java.util.*;
import domain.*;

public class MemberDAOImpl2 implements MemberDAO2{
	Map <String,Object> map;
	List <MemberBean2> list;
	public static MemberDAO2 instance = new MemberDAOImpl2();
	public static MemberDAO2 getInstance() {return instance;}
	private MemberDAOImpl2() {
		map = new HashMap<>();
		list = new ArrayList<>();
	}
	@Override
	public void insertMember(MemberBean2 member) {
		map.put(member.getId(), member);
		list.add(member);
		
	}
	@Override
	public List<MemberBean2> selectAll() {
				return list;
	}
	@Override
	public List<MemberBean2> selectSomeMember(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String selectOne(String one) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateMember(MemberBean2 member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteMember(MemberBean2 member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean login(MemberBean2 member2) {
		boolean flag1 = false;
		MemberBean2 mem = (MemberBean2) map.get(member2.getId());
		System.out.println("memId:"+mem.getId()+"memPass" + mem.getPass());
		if(mem.getId().equals(member2.getId()) && mem.getPass().equals(member2.getPass()))  {
			flag1 = true;
		}else {
			flag1 = false;
		}
		System.out.println(flag1);
		return flag1;
	}

	
}
