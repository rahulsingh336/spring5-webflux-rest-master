package rs.springframework.spring5webfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import rs.springframework.spring5webfluxrest.domain.Vendor;

/**
 * Created by rs on 2/12/2018.
 */
public interface VendorRepository extends ReactiveMongoRepository<Vendor, String>{
}
