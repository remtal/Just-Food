package uk.ac.city.acwf619.recipe.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * A controller to handle GET requests to the home and opera pages
 *
 */
@Controller
public class RecipeController {


    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from index.html (no model required)
     */
    @RequestMapping (value = "/")
    public ModelAndView showHome(){
        return new ModelAndView("index");
    }

    /**
     * Controller method to handle a GET request to the /carmen endpoint
     *
     * @return ModelAndView returns a view constructed from carmen.html (no model required)
     */
    @RequestMapping(value = "/snacks")
    public ModelAndView showSnacks(){
        return new ModelAndView("snacks");
    }

    /**
     * Controller method to handle a GET request to the /flute endpoint
     *
     * @return ModelAndView returns a view constructed from flute.html (no model required)
     */
    @RequestMapping(value = "/drinks")
    public ModelAndView showDrinks(){
        return new ModelAndView("drinks");
    }

    /**
     * Controller method to handle a GET request to the /rigoletto endpoint
     *
     * @return ModelAndView returns a view constructed from rigoletto.html (no model required)
     */
    @RequestMapping(value = "/icecream")
    public ModelAndView showIceCream(){
        return new ModelAndView("icecream");
    }

    @RequestMapping(value = "/lunch")
    public ModelAndView showLunch(){
        return new ModelAndView("lunch");
    }

    @RequestMapping(value = "/breakfast")
    public ModelAndView showBreakfast(){
        return new ModelAndView("breakfast");
    }
    @RequestMapping(value = "/dinner")
    public ModelAndView showDinner(){
        return new ModelAndView("dinner");
    }
    @RequestMapping(value = "/savedRecipes")
    public ModelAndView showSavedRecipes(){
        return new ModelAndView("savedRecipes");
    }
}
