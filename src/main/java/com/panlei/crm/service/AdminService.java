package com.panlei.crm.service;

import com.panlei.crm.entity.Administor;
import com.panlei.crm.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pan_l
 * @ClassName AdminService
 * @Description
 * @date 2019-07-17 15:24
 */
@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Administor findAdmin(String name, String password) {
        return adminMapper.findAdministor(name, password);
    }
}
