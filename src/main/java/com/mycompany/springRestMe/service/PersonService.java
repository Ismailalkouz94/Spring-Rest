/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.service;

import com.mycompany.springRestMe.entity.Person;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface PersonService {

    public void addPerson(Person p);

    public void updatePerson(Person p);

    public void deletePerson(int id);

    public List<Person> listAllPerson();

    public List<Person> findById(int id);

}
