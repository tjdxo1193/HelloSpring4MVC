package sungtae.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    // 호출방법 : http://localhost:8080/
    // 최신방식
    @GetMapping("/") // action 메서드
    public String index(){

        // 비지니스 로직 처리

        return "index"; // view 리턴

        // servlet-context.xml의 뷰리졸버 정의문에 의해
        // 머리말 + 리턴값 + 꼬리말을 조합해서 뷰 렌더링
        // /WEB-INF/jsp/ + index + .jsp
    }

    // 호출방법 : http://localhost:8080/hello
    // 예전방식
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(){
        // View페이지에 데이터를 실어서 보내고 싶으면 ModelAndView를 사용.
        ModelAndView mv = new ModelAndView();

        mv.setViewName("hello"); // 뷰 지정
        // /WEB-INF/jsp/ + hello + .jsp

        mv.addObject("msg", "Hello, World!");
        mv.addObject("msg2", "안녕하세요~ 스프링4");
        mv.addObject("msg3", "こんにちはスプリング");
        // 뷰에 넘길 객체를 ModelAndView 객체에 담음
        // msg 변수에 Hello, World 값을 담음
        return mv;
    }

}