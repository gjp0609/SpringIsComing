package services.impl;

import dao.PersonDao;
import entity.Person;
import services.PersonService;

import java.util.List;

/**
 * PersonServiceImpl
 * Created by gjp06 on 17.5.14.
 */
public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    @Override
    public List<Person> findPerson(Person person) {
        return dao.selectPerson(new Person());
    }

    @Override
    public int addPerson(Person person) {
        return dao.insertPerson(person);
    }

    @Override
    public int removePerson(Person person) {
        return dao.deletePerson(person);
    }

    @Override
    public int modifyPerson(Person person) {
        return dao.updatePerson(person);
    }

    public void setDao(PersonDao dao) {
        this.dao = dao;
    }
}
