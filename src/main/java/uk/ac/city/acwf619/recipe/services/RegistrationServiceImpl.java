package uk.ac.city.acwf619.recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.city.acwf619.recipe.dao.RecipeRepository;
import uk.ac.city.acwf619.recipe.entites.RecipeUser;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    /**
     * The repository for opera user data.
     */
    private RecipeRepository recipeRepository;

    /**
     * Constructor based dependency injection
     *
     * @param recipeRepository the opera user repo.
     */
    @Autowired
    public RegistrationServiceImpl(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    /**
     * Saves an opera user to the database.
     *
     * @param recipeUser the opera user to be saved.
     */
    @Override
    public void registerUser(RecipeUser recipeUser) {
        recipeRepository.save(recipeUser);
    }
}
