package dev.mvc.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dev.mvc.member.MemberProcInter;

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
		
		List<NoticeVO> list = this.NoticeProc.list();
		mav.addObject("list", list);
		
		mav.setViewName("/notice/list");
		
		return mav;
	}
	

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
				
		mav.setViewName("/notice/read");
		return mav;
	}
}

