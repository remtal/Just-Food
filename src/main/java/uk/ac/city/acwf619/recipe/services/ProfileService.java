package uk.ac.city.acwf619.recipe.services;

import uk.ac.city.acwf619.recipe.entites.CollatedUser;

/**
 * Profile service interface that specifies a method to return a CollatedUser.
 */
public interface ProfileService {

    CollatedUser getProfile(String email);
}
