package dev.mvc.member;

import java.util.HashMap;

public interface MemberDAOInter {
	/**
	 * �α���
	 * @param hashMap
	 * @return
	 */
	public int login(HashMap<Object,Object> hashMap);
	
	/**
	 * id �о����
	 * @param id
	 * @return
	 */
	public MemberVO readById(String id);
}
