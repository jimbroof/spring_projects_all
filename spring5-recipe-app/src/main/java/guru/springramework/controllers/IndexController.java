package guru.springramework.controllers;

import guru.springramework.domain.Category;
import guru.springramework.domain.Recipe;
import guru.springramework.domain.UnitOfMeasure;
import guru.springramework.repositories.CategoryRepository;
import guru.springramework.repositories.RecipeRepository;
import guru.springramework.repositories.UnitOfMeasureRepository;
import guru.springramework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Joachim on 24/03/2018.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index Page");

        model.addAttribute("recipes",recipeService.getRecipes());

        return  "index";
    }
}
