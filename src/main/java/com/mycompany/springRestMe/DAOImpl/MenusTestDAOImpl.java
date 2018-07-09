/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.DAOImpl;

import com.mycompany.springRestMe.DAO.MenusTestDAO;
import com.mycompany.springRestMe.entity.MenusTest;
import com.mycompany.springRestMe.entity.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class MenusTestDAOImpl implements MenusTestDAO {

    @Autowired
    private SessionFactory sessionFactory;

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

    @SuppressWarnings("unchecked")
    @Override
    public List<MenusTest> listAllMenuTest() {
        Session session = sessionFactory.getCurrentSession();
        List<MenusTest> menusTestList = session.createQuery("from MenusTest").list();
        return menusTestList;
    }

    @Override
    public List<MenusTest> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
