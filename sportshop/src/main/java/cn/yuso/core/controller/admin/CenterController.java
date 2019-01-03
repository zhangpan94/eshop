package cn.yuso.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/controller")
public class CenterController {

    //跳转入口页面
    @RequestMapping(value = "/index.do",method = RequestMethod.GET)
    public String index(){

        return "index";
    }
    //跳转头页面
    @RequestMapping(value = "/top.do",method = RequestMethod.GET)
    public String top(){

        return "top";
    }
    //跳转主页面
    @RequestMapping(value = "/main.do",method = RequestMethod.GET)
    public String main(){

        return "main";
    }
    //跳转左页面
    @RequestMapping(value = "/right.do",method = RequestMethod.GET)
    public String right(){

        return "right";
    }
    //跳转右页面
    @RequestMapping(value = "/left.do",method = RequestMethod.GET)
    public String left(){

        return "left";
    }
}
