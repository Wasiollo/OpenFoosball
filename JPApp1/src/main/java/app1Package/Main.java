package app1Package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] strs){

        System.out.println("HAHAH");

        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Person p= (Person) context.getBean("person");
        System.out.println(p);
    }
}
