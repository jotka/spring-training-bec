package pl.finsys.springJpa;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface CarDao {
    public List<Car> getCars() throws DataAccessException;
    public Car getCar(Long carId) throws DataAccessException;
    public void save(Car car) throws DataAccessException;
}
