package sungtae.spring.mvc.controller;

// URL          View
// ~/sungjuk    (sungjuk.jsp)
// ~/sungjukok  (sungjukok.jsp)

// ~/sungjuklist
// ~/sungjukview


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import sungtae.spring.mvc.service.SungJukV13Service;
import sungtae.spring.mvc.vo.SungJukVO;

@Controller
public class SungJukController {

    @Autowired
    private SungJukV13Service sjsrv13;

    // 성적입력폼 출력
    @GetMapping("/sungjuk")
    public String sungjuk(){
        return "sungjuk";
    }

    // 성적입력처리 (post 방식으로 요청시 호출됨)
    // 성적입력폼에 입력한 내용들은 스프링 컨테이너에 의해
    // SungJukVO의 멤버변수에 자동으로 저장됨
    // 단, form의 각 name과 SungJukVO의 멤버변수명은 일치해야함
    // ~/sungjuk -> ~/sungjukok -> sjsrv13 -> sjdao12 -> db
    //    view           WAS       service      dao
    @PostMapping("/sungjukok")
    public ModelAndView sungjukok(SungJukVO sjvo){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("sungjukok");
        mv.addObject("result", sjsrv13.newSungJuk(sjvo));
        mv.addObject("sj", sjvo);

        return mv;
    }

    // 성적 데이터 조회
    // 학생번호, 이름, 국어, 영어, 수학, 등록일
    // ~/sungjuklist -> sjsrv13 -> sjdao12 -> db
    //    view          service      dao
    @GetMapping("/sungjuklist")
    public ModelAndView sungjuklist(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("sungjuklist");
        mv.addObject("sjlist", sjsrv13.readSungJuk() );

        return mv;
    }

    // sungjuklist.jsp에서
    // 목록에서 학생이름을 클릭하면 학생번호sjno를 서버로 전송
    //
    @GetMapping("/sungjukview")
    public ModelAndView sungjukview(String sjno){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("sungjukview");
        // 뷰 리졸버의 머리글 + 뷰이름 + 뷰리졸버의 꼬리글
        // WEB-INF/jsp/ + sungjukview + .jsp

        mv.addObject("sj", sjsrv13.readOneSungJuk(sjno));
        return mv;
    }
}
