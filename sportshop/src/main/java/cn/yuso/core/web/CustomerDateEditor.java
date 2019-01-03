package cn.yuso.core.web;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换器
 */
public class CustomerDateEditor implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder webDataBinder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }
}
