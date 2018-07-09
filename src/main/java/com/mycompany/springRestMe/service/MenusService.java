/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.service;

import com.mycompany.springRestMe.entity.MenusTest;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MenusService {
    
     public void addMenuTest(MenusTest p);

    public void updateMenuTest(MenusTest p);

    public void deleteMenuTest(int id);

    public List<MenusTest> listAllMenuTest();

    public List<MenusTest> findById(int id);
    
}
