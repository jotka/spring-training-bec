package pl.finsys.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.finsys.domain.Product;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
