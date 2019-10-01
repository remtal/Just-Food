package uk.ac.city.acwf619.recipe.services;

import uk.ac.city.acwf619.recipe.entites.RecipeUser;

/**
 * Registration service interface that specifies a method to save user information to the database.
 */
public interface RegistrationService {

    void registerUser(RecipeUser recipeUser);
}
