package com.sdlx.controller;
import com.sdlx.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {
    /**
     * 返回json对象
     * @param response
     * @return
     */
    @RequestMapping("/getJson")
    public String getJson(HttpServletResponse response){
        String tmp = "test";
        this.render(response,tmp);
        return null;
    }

    /**
     * 返回jsp页面并传参数到jsp页面
     * @param request
     * @return
     */
    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        request.setAttribute("test","ceshi");
        return "main";
    }
}
