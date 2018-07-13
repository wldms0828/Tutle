package service;
import domain.*;
import java.util.*;
public interface MemberService2 {
	public void createMember2(MemberBean2 member);
	public List<MemberBean2> memberList();
	public List<MemberBean2> findByMemberWord2(String word);
	public String findMemberById2(String id);
	public int countMember2();
	public void modifyMember2(MemberBean2 member);
	public void removeMember2(MemberBean2 member);
	public boolean login(MemberBean2 member2);

}