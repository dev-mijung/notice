package dev.mvc.member;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberCont {
	@Autowired
	@Qualifier("dev.mvc.member.MemberProc")
	
	MemberProcInter memberProc;
	
	public MemberCont() {
		System.out.println("--> MemberCont created.");
	}
	
  /**
   * 로그인 폼
   * @return
   */
  @RequestMapping(value = "/member/login.do", 
                             method = RequestMethod.GET)
  public ModelAndView login() {
    ModelAndView mav = new ModelAndView();
  
    mav.setViewName("/member/login_form");
    return mav;
  }
  
  /**
   * 로그인 처리
   * @return
   */
  @RequestMapping(value = "/member/login.do", 
                             method = RequestMethod.POST)
  public ModelAndView login_proc(HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 HttpSession session,
                                                 String id, String passwd) {
    ModelAndView mav = new ModelAndView();
    HashMap<Object, Object> map = new HashMap<Object, Object>();
    map.put("id", id);
    map.put("passwd", passwd);
    
    int count = this.memberProc.login(map);
    if (count == 1) { // 로그인 성공
      MemberVO memberVO = memberProc.readById(id);
      session.setAttribute("memberno", memberVO.getMemberno());
      session.setAttribute("id", id);
      session.setAttribute("mname", memberVO.getMname());
      
      mav.setViewName("redirect:/notice/list.do");  
    } else {
      mav.setViewName("redirect:/member/login_fail_msg.jsp");
    }
        
    return mav;
  }
}
