package services;

import entity.Person;

import java.util.List;

/**
 * Created by gjp06 on 17.5.14.
 */
public interface PersonService {
    public List<Person> findPerson(Person person);

    public int addPerson(Person person);

    public int removePerson(Person person);

    public int modifyPerson(Person person);
}
