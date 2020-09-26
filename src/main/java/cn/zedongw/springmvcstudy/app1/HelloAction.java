package cn.zedongw.springmvcstudy.app1;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: HelloAction
 * @Description: SpringMVC演示类
 * @Author: ZeDongW
 * @Date: 2020/9/26 0026 21:08
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class HelloAction implements Controller {

    /**
     * Description: 业务逻辑处理
     * @methodName: handleRequest
     * @param request 1
     * @param response 2
     * @throws
     * @return: org.springframework.web.servlet.ModelAndView
     * @author: ZeDongW
     * @date: 2020/9/26 0026 22:00
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","第一个springmvc应用程序");
        modelAndView.setViewName("/jsp/success.jsp");
        return modelAndView;
    }
}
