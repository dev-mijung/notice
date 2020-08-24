package dev.mvc.member;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dev.mvc.member.MemberProc")
public class MemberProc implements MemberProcInter {
@Autowired
	MemberDAOInter MemberDAO;

	@Override
	public int login(HashMap<Object,Object> hashMap) {
		int cnt = this.MemberDAO.login(hashMap);
		return cnt;
	}

	@Override
	public MemberVO readById(String id) {
		MemberVO memberVO = this.MemberDAO.readById(id);
		return memberVO;
	}
}
