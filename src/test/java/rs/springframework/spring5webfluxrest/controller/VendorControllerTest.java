package rs.springframework.spring5webfluxrest.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rs.springframework.spring5webfluxrest.domain.Category;
import rs.springframework.spring5webfluxrest.domain.Vendor;
import rs.springframework.spring5webfluxrest.repository.CategoryRepository;
import rs.springframework.spring5webfluxrest.repository.VendorRepository;

/**
 * Created by rs on 2/12/2018.
 */
public class VendorControllerTest {

    WebTestClient webTestClient;
    VendorRepository vendorRepository;
    VendorController vendorController;

    @Before
    public void setup(){
        vendorRepository = Mockito.mock(VendorRepository.class);
        vendorController = new VendorController(vendorRepository);
        webTestClient = WebTestClient.bindToController(vendorController).build();
    }

    @Test
    public void list(){
        BDDMockito.given(vendorRepository.findAll())
                .willReturn(Flux.just(Vendor.builder().firstName("Fred").lastName("Flintstone").build(),
                        Vendor.builder().firstName("Barney").lastName("Rubble").build()));

        webTestClient.get()
                .uri("/api/v1/vendors/")
                .exchange()
                .expectBodyList(Vendor.class)
                .hasSize(2);
    }

    @Test
    public void getById(){

        BDDMockito.given(vendorRepository.findById("someid"))
                .willReturn(Mono.just(Vendor.builder().firstName("firstName")
                        .lastName("lastName")
                        .build()));

        webTestClient.get()
                .uri("/api/v1/vendor/someid")
                .exchange()
                .expectBody(Vendor.class);


    }
}
