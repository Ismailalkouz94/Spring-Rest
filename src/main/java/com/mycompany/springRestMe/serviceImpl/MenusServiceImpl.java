/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.serviceImpl;

import com.mycompany.springRestMe.DAO.MenusTestDAO;
import com.mycompany.springRestMe.entity.MenusTest;
import com.mycompany.springRestMe.service.MenusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class MenusServiceImpl implements MenusService {
    
    @Autowired
     private MenusTestDAO menusTestDAO;

    @Override
    public void addMenuTest(MenusTest p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMenuTest(MenusTest p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMenuTest(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MenusTest> listAllMenuTest() {
        return menusTestDAO.listAllMenuTest();
    }

    @Override
    public List<MenusTest> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
