package dao;

import domain.MemberBean;
import java.util.*;
public interface MemberDAO {
	public void insertMember(MemberBean mem);
	public List<MemberBean> memberList();
	public List<MemberBean> selectName(String name);
	public String findById(String id);
	public int memberCount();
	public void modifyMember(MemberBean mem);
	public void deleteMember(MemberBean mem);
	public boolean loginMember(MemberBean member);
	public String updatePass(MemberBean mem);
}
