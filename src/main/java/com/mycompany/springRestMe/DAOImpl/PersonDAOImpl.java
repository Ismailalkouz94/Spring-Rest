/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.DAOImpl;

import com.mycompany.springRestMe.DAO.PersonDAO;
import com.mycompany.springRestMe.entity.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ismail
 */
@Repository
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addPerson(Person p) {

        Session session = sessionFactory.getCurrentSession();
        session.persist(p);

    }

    public void updatePerson(Person p) {
        Session session = sessionFactory.getCurrentSession();
        session.update(p);
    }

    public void deletePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person p = (Person) session.load(Person.class, new Integer(id));
        if (p != null) {
            session.delete(p);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Person> listAllPerson() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> personList = session.createQuery("from Person").list();
        return personList;
    }

    @Override
    public List<Person> findById(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Person p = (Person) session.load(Person.class, new Integer(id));
        String selectQuery = "FROM Person WHERE id = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();

    }

}
