package enigine.controller;

/**
 * Created by liyikun on 2017/6/20.
 */
public class SimpleFilterPolicy implements FilterPolicy {

    @Override
    public boolean isPass(String words) {
        return !words.toLowerCase().contains("struts");
    }
}
