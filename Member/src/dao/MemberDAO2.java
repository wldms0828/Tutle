package dao;
import domain.*;
import java.util.*;
public interface MemberDAO2 {
	public void insertMember(MemberBean2 member);
	public List<MemberBean2> selectAll();
	public List<MemberBean2> selectSomeMember(String word);
	public String selectOne(String one);
	public int countMember();
	public void updateMember(MemberBean2 member);
	public void deleteMember(MemberBean2 member);
	public boolean login(MemberBean2 member2);
}