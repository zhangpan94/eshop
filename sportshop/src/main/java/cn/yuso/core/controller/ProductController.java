package cn.yuso.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "")
public class ProductController {

    @RequestMapping(value = "/test/springmvc",method = RequestMethod.POST)
    @ResponseBody
    public String test(String name){
        System.out.println();
        return "";
    }

    /*public void initBinder(WebDataBinder webDataBinder, WebRequest webRequest){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }*/
}
