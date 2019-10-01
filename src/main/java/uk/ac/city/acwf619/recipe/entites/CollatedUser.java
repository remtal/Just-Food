package uk.ac.city.acwf619.recipe.entites;

import java.util.List;
/**
 * An Entity class representing all of the information relevant to a specific operauser including
 * their bookings and login history.
 *
 * */
public class CollatedUser {

    private RecipeUser recipeUser;
    private List<LoginHistory> logins;


    public RecipeUser getRecipeUser() {
        return recipeUser;
    }

    public void setRecipeUser(RecipeUser recipeUser) {

        this.recipeUser = recipeUser;
    }

    public List<LoginHistory> getLogins() {
        return logins;
    }

    public void setLogins(List<LoginHistory> logins) {

        this.logins = logins;
    }


}