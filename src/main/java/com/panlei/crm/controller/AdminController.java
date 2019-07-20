package com.panlei.crm.controller;

import com.panlei.crm.entity.Administor;
import com.panlei.crm.entity.Customer;
import com.panlei.crm.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author pan_l
 * @ClassName AdminController
 * @Description
 * @date 2019-07-17 15:25
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private CustomerService customerService;


    @RequestMapping("/index")
    public String index(Model model) {
        // 过滤器的工作
//        Administor admin = (Administor) httpSession.getAttribute("admin");
//        if(admin==null) return "login";

        List<Customer> customers = customerService.queryCustomers();
        model.addAttribute("customers", customers);
        return "list";
    }

}
