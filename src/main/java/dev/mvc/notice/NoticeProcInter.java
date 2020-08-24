package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

public interface NoticeProcInter {
	/**
	 * 게시글 등록
	 * @param noticeVO
	 * @return
	 */
	 public int create(NoticeVO noticeVO);
	 
	 /**
	  * 게시글 목록
	  * @return
	  */
	 public List<NoticeVO> list();
	 
	 /**
	  * 조회
	  * @param boardno
	  * @return
	  */
	 public NoticeVO read(int boardno);
	 
	 /**
	  * 비밀번호 설정
	  * @param hashMap
	  * @return
	  */
	 public int passwd_update(HashMap<Object,Object> hashMap);
	 
	 /**
	  * member + notice
	  * @param memberno
	  * @return
	  */
	 public Member_Notice_VO join_by_memberno(int memberno);
}
