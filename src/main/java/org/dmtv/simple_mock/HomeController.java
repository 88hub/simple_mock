package org.dmtv.simple_mock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
public class HomeController {
    @RequestMapping("/")
    public Answer getInfo() {
        return new Answer("testAcc", "testPass");
    }

    @RequestMapping(value = "/", method= RequestMethod.POST)
    public Answer postInfo(@RequestBody Answer answer) {
        return new Answer(answer.getAccount(), new Date().toString());
    }
}
