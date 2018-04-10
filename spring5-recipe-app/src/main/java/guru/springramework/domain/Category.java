package guru.springramework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by Joachim on 26/03/2018.
 */
@Data
@EqualsAndHashCode(exclude={"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
