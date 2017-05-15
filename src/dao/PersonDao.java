package dao;

import entity.Person;

import java.util.List;

/**
 * PersonDao
 * Created by gjp06 on 17.5.14.
 */
public interface PersonDao {
    public List<Person> selectPerson(Person person);

    public int insertPerson(Person person);

    public int deletePerson(Person person);

    public int updatePerson(Person person);

}
