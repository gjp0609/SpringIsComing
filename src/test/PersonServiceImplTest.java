package test;

import entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.PersonService;

import java.util.List;

/**
 * PersonServiceImplTest
 * Created by gjp06 on 17.5.14.
 */
class PersonServiceImplTest {


    @Test
    void findPerson() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
        PersonService service = (PersonService) ctx.getBean("personService");
        List<Person> people = service.findPerson(new Person());
        if (people != null)
            for (Person p : people)
                System.out.println(p);
        else System.out.println("else");
    }

    @Test
    void removePerson() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
        PersonService service = (PersonService) ctx.getBean("personService");
        Person person = new Person();
        person.setId(1009);
        int result = service.removePerson(person);
        System.out.println(result);
    }

    @Test
    void modifyPerson() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
        PersonService service = (PersonService) ctx.getBean("personService");
        Person person = new Person();
        person.setId(1004);
        List<Person> people = service.findPerson(person);
        people.get(0).setMobile("15678901234");
        int result = service.modifyPerson(people.get(0));
        System.out.println(result);
    }

    @Test
    void addPerson() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
        PersonService service = (PersonService) ctx.getBean("personService");
        Person person = new Person();
        person.setName("绘梨衣");
        person.setEmail("hly@y.yy");
        person.setMobile("12405849506");
        person.setTelPhone("050-4567654");
        person.setCity("东京");
        int result = service.addPerson(person);
        System.out.println(result);
    }
}