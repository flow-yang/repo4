package flow.springboothelloquick.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @date 2020/9/8 - 10:46
 */
//@ResponseBody //这个类的所有方法返回的数据直接写给l浏览器
//@Controller
@RestController //是上面两个的结合体，可以替换上面的两个
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
