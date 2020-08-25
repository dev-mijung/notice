package dev.mvc.member;

import java.util.HashMap;

public interface MemberDAOInter {
	/**
	 * 로그인
	 * @param hashMap
	 * @return
	 */
	public int login(HashMap<Object,Object> hashMap);
	
	/**
	 * id 읽어오기
	 * @param id
	 * @return
	 */
	public MemberVO readById(String id);
	
	/**
	 * 조회
	 * @param memberno
	 * @return
	 */
	public MemberVO read(int memberno);
}
