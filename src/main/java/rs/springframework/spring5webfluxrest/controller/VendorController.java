package rs.springframework.spring5webfluxrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rs.springframework.spring5webfluxrest.domain.Category;
import rs.springframework.spring5webfluxrest.domain.Vendor;
import rs.springframework.spring5webfluxrest.repository.VendorRepository;

/**
 * Created by rs on 2/12/2018.
 */
@RestController
public class VendorController {

    private final VendorRepository vendorRepository;

    public VendorController(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @GetMapping("api/v1/vendors")
    Flux<Vendor> list(){
        return vendorRepository.findAll();
    }
    @GetMapping("api/v1/vendor/{id}")
    Mono<Vendor> getById(@PathVariable String id){
        return vendorRepository.findById(id);
    }

}
