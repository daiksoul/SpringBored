package we.geee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import we.geee.user.UserServiceImpl;
import we.geee.user.UserVO;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/login")
public class LoginControl {
    @Autowired
    UserServiceImpl service;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginOk",method = RequestMethod.POST)
    public String loginOk(HttpSession session, UserVO vo){
        String toRet = "";

        if(session.getAttribute("login")!=null){
            session.removeAttribute("login");
        }

        UserVO loginVo = service.getUser(vo);
        if(loginVo!=null){
            session.setAttribute("login",loginVo);
            toRet = "redirect:/board/list";
            System.out.println("로그인 성공");
        }else{
            toRet = "redirect:/login/login";
        }
        return toRet;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        System.out.println("로그아웃 성공");
        session.invalidate();
        return "redirect:/login/login";
    }
}