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
        List<Customer> customers = customerService.queryCustomers();
        model.addAttribute("customers", customers);
        return "list";
    }

    @RequestMapping("/toAdd")
    public String addCus() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(Customer customer) {
        customerService.save(customer);
        return "redirect:/admin/index";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        customerService.delete(id);
        return "redirect:/admin/index";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,int id) {
        Customer customer=customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        return "edit";
    }

    @RequestMapping("/edit")
    public String edit(Customer customer) {
        customerService.edit(customer);
        return "redirect:/admin/index";
    }


}
