package rs.springframework.spring5webfluxrest.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rs on 2/12/2018.
 */
@Data
@Document
public class Category {

    @Id
    private String id;

    private String description;
}
