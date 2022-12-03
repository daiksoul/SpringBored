package we.geee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class YouControl {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("serverTime", new Date());
        return "index";
    }
}
