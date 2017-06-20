package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liyikun on 2017/6/18.
 */
@Controller
public class ExampleController {

    @RequestMapping(value = "/text", method = RequestMethod.GET)
    @ResponseBody
    public String returnString() {
        return "Hello!";
    }

    @RequestMapping("/")
    public String returnHtml(@RequestParam(value = "name", defaultValue = "world", required = false) String name, Model model) {
        model.addAttribute("message", "Hello " + name + ", from the controller");
        return "hello";
    }
}
