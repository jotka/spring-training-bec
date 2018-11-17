package pl.finsys.springJpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository("carDao")
public class CarDaoImpl implements CarDao {

    protected EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Car> getCars() throws DataAccessException {
        Query query = getEntityManager().createQuery("select c from Car c");
        List<Car> resultList = query.getResultList();
        return resultList;
    }

    public Car getCar(Long carId) throws DataAccessException {
        return getEntityManager().find(Car.class, carId);
    }

    @Transactional()
    @Override
    public void save(Car car) throws DataAccessException {
        entityManager.persist(car);
    }
}