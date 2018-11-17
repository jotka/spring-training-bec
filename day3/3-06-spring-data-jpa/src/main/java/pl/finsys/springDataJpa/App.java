package pl.finsys.springDataJpa;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CrudRepository repository = context.getBean(EmployeeRepository.class);

        Employee emp = new Employee(22, "Saint", "Peter", "Engineering");
        Employee emp2 = new Employee(23, "Jack", " Dorsey", "Imaginea");
        Employee emp3 = new Employee(24, "Sam", "Fox", "Imaginea");

        repository.save(emp);
        repository.save(emp2);
        repository.save(emp3);

        context.close();
    }
}
