package com.panlei.crm.service;

import com.panlei.crm.entity.Customer;
import com.panlei.crm.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pan_l
 * @ClassName CustomerService
 * @Description
 * @date 2019-07-20 17:31
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public List<Customer> queryCustomers() {
        List<Customer> customers = customerMapper.queryList();
        return customers;
    }

    public void save(Customer customer) {
        customerMapper.save(customer);
    }

    public void delete(int id) {
        customerMapper.delete(id);
    }

    public Customer findCustomerById(int id) {
        return customerMapper.findCustomerById(id);
    }

    public void edit(Customer customer) {
        customerMapper.updateCus(customer);
    }
}
