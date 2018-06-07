package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Joachim on 29/03/2018.
 */
@Slf4j
@Service
public class RecipeServicesImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServicesImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Set<Recipe> getRecipes() {
        log.debug("Im in the service");
        Set<Recipe> recipeSet = new HashSet<>();

        // List<Recipe> recipeList = (List<Recipe>) recipeRepository.findAll();
        //for (Recipe recipe : recipeList)
        //    recipeSet.add(recipe);

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }
}
