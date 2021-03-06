package rs.springframework.spring5webfluxrest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rs on 2/12/2018.
 */
@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    private String id;

    private String description;
}
