package guru.springramework.services;

import guru.springramework.domain.Recipe;
import guru.springramework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joachim on 29/03/2018.
 */
@Service
public class RecipeServicesImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServicesImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
