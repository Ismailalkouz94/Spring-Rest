/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.controller;

import com.mycompany.springRestMe.entity.MenusTest;
import com.mycompany.springRestMe.entity.Person;
import com.mycompany.springRestMe.service.MenusService;
import com.mycompany.springRestMe.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismail
 */
@CrossOrigin()
@RestController
//@RequestMapping("/persons")
public class PesronController {
    
    @Autowired
    private MenusService menusService;

    @Autowired
    private PersonService personService;

//    public void setPersonService(PersonService personService) {
//        this.personService = personService;
//    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public @ResponseBody
    String addPerson(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age) {

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        personService.addPerson(person);

        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public @ResponseBody
    String updatePerson(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "age") int age) {

        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        personService.updatePerson(person);

        return "OK";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public @ResponseBody
    String deletePerson(@RequestParam(value = "id") int id) {
        if (!personService.findById(id).isEmpty()) {
            personService.deletePerson(id);
            return "OK";
        } else {
//            throw new InformationNotExist();
            return "Person Not Found";
        }

    }

    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> listAll() {

        return personService.listAllPerson();

    }

    
    @RequestMapping(value = "/listAllMenus", method = RequestMethod.GET)
    @ResponseBody
    public List<MenusTest> listAllMenus() {

        return menusService.listAllMenuTest();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> findById(@RequestParam(value = "id") int id) {

        return personService.findById(id);

    }

}
