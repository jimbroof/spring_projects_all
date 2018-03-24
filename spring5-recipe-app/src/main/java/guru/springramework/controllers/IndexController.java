package guru.springramework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Joachim on 24/03/2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        System.out.println("Some message to say .....43243243243");
        return  "index";
    }
}
