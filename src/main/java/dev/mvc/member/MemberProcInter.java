package dev.mvc.member;

import java.util.HashMap;

public interface MemberProcInter {
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
	
	/**
	 * ��ȸ
	 * @param memberno
	 * @return
	 */
	public MemberVO read(int memberno);
}
