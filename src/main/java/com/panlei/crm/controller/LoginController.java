package com.panlei.crm.controller;

import com.panlei.crm.entity.Administor;
import com.panlei.crm.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author pan_l
 * @ClassName LoginController
 * @Description
 * @date 2019-07-17 15:25
 */
@Controller
public class LoginController {
    @Autowired
    private AdminService adminService;
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login(HttpSession httpSession) {
        if(httpSession.getAttribute("admin")!=null) {
            return "redirect:/admin/index";
        } else {
            return "login";
        }
    }

    /**
     * 用户登录验证
     */
    @RequestMapping(value="/logincheck", method= RequestMethod.POST)
    private String loginCheck(Administor admin, HttpSession httpSession) {
        if(httpSession.getAttribute("admin")!=null) {
            return "redirect:/admin/index";
        } else {
            // 非空校验
            if (admin.getName() != null && admin.getPassword() != null) {
                logger.info("name:" + admin.getName() + ",password:" + admin.getPassword());
                Administor administor = adminService.findAdmin(admin.getName(), admin.getPassword());
                if (administor != null) {
                    httpSession.setAttribute("admin", administor);
                    logger.info("session设置");
                    return "redirect:/admin/index";
                } else {
                    return "login";
                }
            } else {
                return "login";
            }
        }
    }
}
