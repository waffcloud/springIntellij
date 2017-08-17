package fv.controller;


import fv.pojo.Test;
import fv.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Description
 * Created by xuhui on 2017/8/16.
 */

/**
 * ����
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    @Qualifier("testService")
    private TestService testService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Test getTestById(@RequestParam("id") String id) {
    //    id="1";
        return testService.getById(Integer.parseInt(id));
    }
}
