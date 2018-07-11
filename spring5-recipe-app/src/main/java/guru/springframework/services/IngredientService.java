package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;


/**
 * Created by Joachim on 08/06/2018.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    public IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId , Long idToDelete);

}
