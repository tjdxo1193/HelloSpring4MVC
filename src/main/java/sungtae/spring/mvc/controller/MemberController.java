package sungtae.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import sungtae.spring.mvc.service.MemberService;
import sungtae.spring.mvc.vo.MemberVO;

@Controller
public class MemberController {

    @Autowired
    private MemberService msrv04;

    @GetMapping("/member")
    public String member(){
        return "member";
    }

    @PostMapping("/memberok")
    public ModelAndView memberok(MemberVO mvo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("memberok");
        mv.addObject("result", msrv04.newMember(mvo));
        mv.addObject("mvo", mvo);
        return mv;
    }

    @GetMapping("/memberlist")
    public ModelAndView memberlist(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("memberlist");  //WEB-INF/jsp/memberlist.jsp


        mv.addObject("mvos", msrv04.readMember());

        return mv;
    }
    // memberlist.jsp에서
    // 목록에서 회원이름을 클릭하면 회원번호를 서버로 전송
    //
    @GetMapping("/memberlist")
    public ModelAndView memberview(String mv){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("sungjukview");
        mv.addObject("mv", msrv04.readMember(mv));
        return mv;
    }

}
