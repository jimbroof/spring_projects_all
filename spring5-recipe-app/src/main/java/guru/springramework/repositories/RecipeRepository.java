package guru.springramework.repositories;

import guru.springramework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Joachim on 26/03/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {

    Optional<Recipe> findByDescription(String description);

}
