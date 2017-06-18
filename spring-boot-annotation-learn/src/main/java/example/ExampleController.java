package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyikun on 2017/6/18.
 */
@Controller
public class ExampleController {

    @RequestMapping(value = "/controller/text")
    public String returnString() {
        return "Hello!";
    }

    @RequestMapping(value = "/controller/html")
    public String returnHtml() {
        return "/hello";
    }
}
