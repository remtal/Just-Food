package uk.ac.city.acwf619.recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.city.acwf619.recipe.dao.HistoryRepository;
import uk.ac.city.acwf619.recipe.dao.RecipeRepository;


import uk.ac.city.acwf619.recipe.entites.CollatedUser;
import uk.ac.city.acwf619.recipe.entites.LoginHistory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileServiceImpl implements ProfileService {


    /**
     * The repository for opera user data.
     */
    private RecipeRepository recipeRepository;
    private HistoryRepository historyRepository;


    @Autowired
    public ProfileServiceImpl(RecipeRepository recipeRepository,
                              HistoryRepository historyRepository){
        this.recipeRepository = recipeRepository;

        this.historyRepository = historyRepository;

    }

    /**
     * The implemented method that collates all the current users information
     * into a single object that will back the profile.html view
     *
     * @param email the current user's email
     * @return CollatedUser a object that aggregates all the user's data.
     */
    @Override
    public CollatedUser getProfile(String email) {
        CollatedUser user = new CollatedUser();
        user.setRecipeUser(recipeRepository.findById(email).orElseThrow(()-> new UsernameNotFoundException("No matching user found.")));
        List<LoginHistory> history = historyRepository.findAll()
                .stream().filter(loginHistory -> loginHistory.getEmail().equals(email))
                .collect(Collectors.toList());
        user.setLogins(history);

        return user;
    }
}
