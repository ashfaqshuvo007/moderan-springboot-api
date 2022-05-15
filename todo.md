# Person application

1. Use Postgres or H2 in-memory as database
2. Create a runnable jar-packaged Spring-Boot application that runs on localhost port 8888 (java -jar app.jar).
4. Create a POST endpoint /person that takes JSON input such as { "person": "Siim Toomingas" } and saves the "Siim Toomingas" part of the json into the data table in Postgres.
5. Create a GET endpoint / person?search=siim that takes the search value ("siim") and finds all rows from the database that include the word "siim" and returns them as a json list.
6. Use Gradle or Maven for dependencies.
7. Write readme on how to run your application from command line.
8. Create a git repository out of the project and push it into Github. Send us the link to the Github repository as a final step of the project.
