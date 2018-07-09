/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.serviceImpl;

import com.mycompany.springRestMe.DAO.PersonDAO;
import com.mycompany.springRestMe.entity.Person;
import com.mycompany.springRestMe.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ismail
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

//    public void setPersonDAO(PersonDAO personDAO) {
//        this.personDAO = personDAO;
//    }

    @Override
    public void addPerson(Person p) {
        personDAO.addPerson(p);
    }

    @Override
    public void updatePerson(Person p) {
        personDAO.updatePerson(p);
    }

    @Override
    public void deletePerson(int id) {
        personDAO.deletePerson(id);
    }

    @Override
    public List<Person> listAllPerson() {
        return personDAO.listAllPerson();
    }

    @Override
    public List<Person> findById(int id) {
        return personDAO.findById(id);
    }

}
