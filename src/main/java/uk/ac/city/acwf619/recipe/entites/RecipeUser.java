package uk.ac.city.acwf619.recipe.entites;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * An Entity class representing an opera user including login information. (Password is
 * set using BCrypt password encoder.
 */
@Entity
public class RecipeUser {

    private String title;
    private String firstName;
    private String lastName;
    @Id
    private String email;
    private String password;
    private Boolean enabled;
    private String authoritiy;

    public RecipeUser(){ }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = new BCryptPasswordEncoder().encode(password);
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthoritiy() {
        return authoritiy;
    }

    public void setAuthoritiy(String authoritiy) {
        this.authoritiy = authoritiy;
    }
}
