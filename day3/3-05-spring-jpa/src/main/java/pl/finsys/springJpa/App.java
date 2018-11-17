package pl.finsys.springJpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CarDao carDao = (CarDao) appContext.getBean("carDao");

        Car car = new Car(15l, "Ford", "Mustang", 1999);

        carDao.save(car);

        List<Car> cars = carDao.getCars();


        for (Car c : cars) {
            System.out.println(c);
        }

    }
}
