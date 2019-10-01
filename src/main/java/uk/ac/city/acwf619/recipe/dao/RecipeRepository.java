package uk.ac.city.acwf619.recipe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.acwf619.recipe.entites.RecipeUser;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeUser, String> {

}
