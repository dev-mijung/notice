package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dev.mvc.notice.NoticeProc")
public class NoticeProc implements NoticeProcInter {
@Autowired
	NoticeDAOInter NoticeDAO;

	@Override
	public int create(NoticeVO noticeVO) {
		int cnt = this.NoticeDAO.create(noticeVO);
		return cnt;
	}

	@Override
	public List<NoticeVO> list() {
		List<NoticeVO> list = this.NoticeDAO.list();
		return list;
	}

	@Override
	public NoticeVO read(int boardno) {
		NoticeVO noticeVO = this.NoticeDAO.read(boardno);
		return noticeVO;
	}

	@Override
	public int passwd_update(HashMap<Object, Object> hashMap) {
		int cnt = this.NoticeDAO.passwd_update(hashMap);
		return cnt;
	}

	@Override
	public Member_Notice_VO join_by_memberno(int memberno) {
		Member_Notice_VO member_Notice_VO = this.NoticeDAO.join_by_memberno(memberno);
		return member_Notice_VO;
	}

}
