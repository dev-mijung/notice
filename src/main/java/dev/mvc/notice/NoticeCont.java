package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dev.mvc.member.MemberProcInter;
import dev.mvc.member.MemberVO;


@Controller
public class NoticeCont {
	@Autowired
	@Qualifier("dev.mvc.member.MemberProc")
	
	MemberProcInter memberProc;
	
	@Autowired
	@Qualifier("dev.mvc.notice.NoticeProc")

	NoticeProcInter	NoticeProc;

	public NoticeCont() {
		System.out.println("--> NoticeCont created.");
	}
	
	// http://localhost:8080/board/notice/create.do
	/**
	 * 등록 폼
	 * @return
	 */
	@RequestMapping(value="/notice/create.do", method=RequestMethod.GET)
		public ModelAndView create() {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("/notice/create");
			return mav;
		}
	
	/**
	 * 등록 처리
	 * @param noticeVO
	 * @return
	 */
	@RequestMapping(value="/notice/create.do", method=RequestMethod.POST)
	public ModelAndView create(NoticeVO noticeVO) {
		ModelAndView mav = new ModelAndView();
		
		int cnt = this.NoticeProc.create(noticeVO);
		mav.addObject("cnt", cnt);
		
		if(cnt==1) {
			mav.setViewName("/notice/create_msg");
		}
		
		return mav;
	}
	
	// http://localhost:8080/board/notice/list.do
	/**
	 * 게시글 목록
	 * @return
	 */
	@RequestMapping(value="/notice/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		List<Member_Notice_VO> list = this.NoticeProc.list();
		mav.addObject("list", list);
		
		mav.setViewName("/notice/list");
		
		return mav;
	}
	
// http://localhost:9090/board/notice/read.do?boardno=1
	/**
	 * 조회
	 * @param boardno
	 * @return
	 */
	@RequestMapping(value="/notice/read.do", method=RequestMethod.GET)
		public ModelAndView read(int boardno) {
		ModelAndView mav = new ModelAndView();
		
		
		NoticeVO noticeVO = this.NoticeProc.read(boardno);
		mav.addObject("noticeVO",noticeVO);
		
		Member_Notice_VO member_Notice_VO = this.NoticeProc.join_by_memberno(boardno);
		mav.addObject("member_Notice_VO", member_Notice_VO);
		
		int cnt = this.NoticeProc.cnt_up(boardno);
		//mav.addObject("cnt", cnt);
		
		if(cnt == 1) {
			this.NoticeProc.cnt_up(boardno);
			mav.addObject("cnt",noticeVO.getCnt());
		}
		
		mav.setViewName("/notice/read");
		return mav;
	}
	
	/**
	 * 비밀번호 등록 폼
	 * @return
	 */
	@RequestMapping(value="/notice/passwdck.do", method=RequestMethod.GET)
	   public ModelAndView passwd_update(int boardno) {
	    ModelAndView mav = new ModelAndView();
	      mav.setViewName("/notice/passwdck");
	    return mav;
	}
	
	/**
	 * 비밀번호 등록 처리
	 * @return
	 */
	@RequestMapping(value="/notice/passwdck.do", method=RequestMethod.POST)
	  public ModelAndView passwd_update(String borad_passwd_1) {
	    ModelAndView mav = new ModelAndView();
	    HashMap<Object, Object> map = new HashMap<Object, Object>();
	    map.put("passwd", borad_passwd_1); //실제 존재하는 컬럼은 passwd만 있어서 passwd로
	    
	    this.NoticeProc.passwd_update(map);
	    
	    return mav;
	}
}