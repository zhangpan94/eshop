package cn.yuso.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/controller")
public class FrameController {

    //商品身体
    @RequestMapping(value = "/frame/product_main.do")
    public String productMain(){
        return "frame/product_main";
    }
    @RequestMapping(value = "/frame/product_left.do")
    public String productLeft(){
        return "frame/product_left";
    }
    @RequestMapping(value = "/frame/order_main.do")
    public String orderMain(){
        return "frame/order_main";
    }
}
