package guru.springramework.services;

import guru.springramework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Joachim on 29/03/2018.
 */
@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
}
