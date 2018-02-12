package rs.springframework.spring5webfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import rs.springframework.spring5webfluxrest.domain.Category;

/**
 * Created by RS on 2/12/2018.
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category, String>{
}
