package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Joachim on 26/03/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
