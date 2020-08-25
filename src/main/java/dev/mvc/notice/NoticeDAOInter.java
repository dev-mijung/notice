  
package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

public interface NoticeDAOInter {
	 
	/**
	 * �Խñ� ���
	 * @param noticeVO
	 * @return
	 */
	 public int create(NoticeVO noticeVO);
	 
	 /**
	  * �Խñ� ���
	  * @return
	  */
	 public List<Member_Notice_VO> list();
	 
	 
	 /**
	  * ��ȸ
	  * @param boardno
	  * @return
	  */
	 public NoticeVO read(int boardno);
	 
	 
	 /**
	  * ��й�ȣ ���
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
	 
	 /**
	  * ��ȸ�� ����
	  * @param boardno
	  * @return
	  */
	 public int cnt_up(int boardno);
}