package enigine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liyikun on 2017/6/20.
 */
@Controller
public class TwitterController {

    @Autowired
    private Twitter twitter;

    @RequestMapping("/")
    public String home() {
        return "searchPage";
    }

    @RequestMapping(value = "/postSearch", method = RequestMethod.POST)
    public String postSearch(HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String search = request.getParameter("search");
        FilterPolicy policy = new SimpleFilterPolicy();
        if (!policy.isPass(search)) {
            redirectAttributes.addFlashAttribute("error", "Try using spring instead!");
            return "redirect:/";
        }
        redirectAttributes.addAttribute("search", search);
        return "redirect:result";
    }

    @RequestMapping("/result")
    public String searchResult() {
        return "resultPage";
    }

    @ModelAttribute("tweets")
    public List<Tweet> getSearchResult(
            @RequestParam(defaultValue = "masterSpringMVC4") String search) {
        SearchResults searchResults = twitter.searchOperations().search(search);
        List<Tweet> tweets =
                searchResults.getTweets();
        return tweets;
    }

    @ModelAttribute("search")
    public String getSearchDescription(
            @RequestParam(defaultValue = "masterSpringMVC4") String search) {
        return search;
    }
}
