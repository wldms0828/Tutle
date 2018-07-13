package service;
import domain.*;
import java.util.*;
public interface MemberService {
	public void createMember(MemberBean mem);
	public List<MemberBean> memberList();
	public List<MemberBean> findByName(String name);
	public String findById(String id);
	public int memberCount();
	public void updateMemeber(MemberBean mem);
	public void deleteMember(MemberBean mem);
	public boolean loginMember(MemberBean member);
	public String updatePass(MemberBean mem);
}
