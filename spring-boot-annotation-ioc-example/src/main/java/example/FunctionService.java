package example;

import org.springframework.stereotype.Service;
/**
 * Created by liyikun on 2017/6/4.
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
