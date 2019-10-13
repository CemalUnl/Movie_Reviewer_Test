/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_reviewer;


public class Movie_Reviewer {

   
    public static void main(String[] args) {
        boolean testFavourite = false;
        Movie[] movies = new Movie[5];

        // Initialise the array elements by looping through the array.
        for (int i = 0; i < movies.length; i++) {
            movies[i] = new Movie();
        }

        // Set the movie titles
        movies[0].setTitle("The Matrix");
        movies[1].setTitle("John Wick");
        movies[2].setTitle("Avengers: Endgame");
        movies[3].setTitle("Fight Club");
        movies[4].setTitle("Atla Gel Şaban");

        MovieReviewer reviewer = new MovieReviewer();
        // tell the Reviewer which movies to rate
        reviewer.setMovies(movies);

        // Initialise the ratings.
        reviewer.rateMovie("The Matrix", 5);
        reviewer.rateMovie("John Wick", 4);
        reviewer.rateMovie("Avengers: Endgame", 1);
        reviewer.rateMovie("Fight Club", 2);
        reviewer.rateMovie("Atla Gel Şaban", 3);

        // Run a test.

        if (reviewer.pickFavourite().equals("The Matrix")) {
            testFavourite = true;
        }

        System.out.println("testFavourite: " + testFavourite);

 
    }
    
}
