package example;

import org.springframework.web.bind.annotation.*;

/**
 * Created by liyikun on 2017/6/18.
 */
@RestController
public class ExampleRestController {

    @RequestMapping(path = "/responseBody")
    @ResponseBody
    public String annotationExampleResponseBody() {
        return "Annotation Example Response Body";
    }

    @RequestMapping(path = "/requestBody", method = RequestMethod.POST)
    public String annotationExampleRequestBody(@RequestBody String name) {
        return "Hello! " + name + ", Annotation Example Request Body";
    }
}
