/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_reviewer;

/**
 *
 * @author cemal
 */
public class MovieReviewer extends Movie {

    private Movie[] movies;

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public void rateMovie(String title, int rating) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getTitle() == title) {
                movies[i].setRating(rating);
            }
        }
    }

    public String pickFavourite() {
        int max = 0;
        int index = 0;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() > max) {
                max = movies[i].getRating();
                index = i;
            }
        }
        return movies[index].getTitle();
    }

}
