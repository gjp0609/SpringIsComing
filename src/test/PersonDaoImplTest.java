package test;

import dao.PersonDao;
import entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by gjp06 on 17.5.14.
 */
class PersonDaoImplTest {
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");

    @Test
    void selectPerson() {
        PersonDao dao = (PersonDao) ctx.getBean("personDao");
        List<Person> people = dao.selectPerson(new Person());
        for (Person p : people) {
            System.out.println(p);
        }
    }

    @Test
    void update() {

        PersonDao dao = (PersonDao) ctx.getBean("personDao");
        Person person = new Person();
        person.setId(1003);
        List<Person> people = dao.selectPerson(person);
        Person p = people.get(0);
        p.setEmail("lmf@ff.ll");
        int i = dao.updatePerson(p);
        System.out.println(i);
        selectPerson();
    }
}