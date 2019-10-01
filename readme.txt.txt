HTML: All .html files are located at: 
- src\main\resources\templates

CSS: All CSS code is contained at:
- src\main\resources\static\css\style.css

Validation Behaviour: Validation behaviour for Registration is handled in:
- src\main\java\uk\ac\city\acwf619\recipe\entites\RecipeUser

Client Side JS: Javascript has been used in two locations. Once located: 
- src\main\resources\static\main.js
and once more located at:
- src\main\resources\templates\savedRecipes.html

Database writes: Database writing is handles in the dao package which is located at:
- src\main\java\uk\ac\city\acwf619\recipe\dao

Database reads: Database reading is handles by dependecies which are located at:
- pom.xml

Security: Security is used when creating the self signed certificate which is located at: 
- src\main\resources\tls-recipe.jks
Additionally, Security is also present in the SecurityConfiguration which is located at:
- src\main\java\uk\ac\city\acwf619\recipe\config\SecurityConfig.java
Also in Recipe user to BCrypt encode the password which is located at:
- src\main\java\uk\ac\city\acwf619\recipe\entites\recipeUser.java

