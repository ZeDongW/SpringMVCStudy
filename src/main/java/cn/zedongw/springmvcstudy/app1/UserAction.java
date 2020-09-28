package cn.zedongw.springmvcstudy.app1;

import cn.zedongw.springmvcstudy.entity.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.Iterator;

/**
 * @ClassName: UserAction
 * @Description: 用户action
 * @Author: ZeDongW
 * @Date: 2020/9/27 0027 22:24
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
@Controller
@RequestMapping("/user")
public class UserAction {

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
    }

    /**
     * Description: 使用注解定义action
     * @methodName: addMethod
     * @param user 1
     * @param model 2
     * @throws
     * @return: java.lang.String
     * @author: ZeDongW
     * @date: 2020/9/28 0028 20:25
     */
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/add")
    public String addMethod(User user, Model model){
        model.addAttribute("user", user);
        return "/jsp/success.jsp";
    }
}
