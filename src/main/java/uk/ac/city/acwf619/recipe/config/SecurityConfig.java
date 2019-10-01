package uk.ac.city.acwf619.recipe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import uk.ac.city.acwf619.recipe.services.RecipeUserDetails;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * Custom user details service that also records user login
     * history in the database.
     */
    private RecipeUserDetails recipeUserDetails;

    @Autowired
    public SecurityConfig(RecipeUserDetails recipeUserDetails) {

        this.recipeUserDetails = recipeUserDetails;

    }

    /**
     * Set the authentication service to use the custom user details service.
     *
     * @param auth
     * @throws Exception
     */
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .authenticationProvider(authenticationProvider());
    }


    /**
     * Only provide access to the profile and booking pages to logged in users.
     *
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/book", "/profile")
                .authenticated()
                .and()
                .formLogin();

        //disable security so that the database console can be accessed.
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }

    /**
     * Method to construct an authentication provided which uses the  custom user details
     * service so it can be supplied to the auth object (together with a BCrypt password
     * encoder. Method is called when configuring authentication.
     *
     * @return DaoAuthenticationProvider an authentication provider that contains the custom
     * user details service and password encoder.
     */
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(recipeUserDetails);
        authProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        return authProvider;
    }
}
