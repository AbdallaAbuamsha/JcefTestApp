package konfusio.jceftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(method = GET,path = "/hello")
    public String hello(){
        return "hello";
    }
}
