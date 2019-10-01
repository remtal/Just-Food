package uk.ac.city.acwf619.recipe.entites;

import java.nio.file.attribute.UserPrincipal;

/**
 * An OperaUserPricipal represents the current user in the user details service.
 */
public class RecipeUserPrinciple implements UserPrincipal {

    private RecipeUser recipeUser;

    public RecipeUserPrinciple(RecipeUser recipeUser){
        this.recipeUser = recipeUser;
    }

    @Override
    public String getName() {
        return recipeUser.getEmail();
    }


}
