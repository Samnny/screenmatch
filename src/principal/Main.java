package principal;

import calculation.RecommendationFilter;
import calculation.TimeCalculator;
import model.Episode;
import model.Movie;
import model.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Your Name", 2020);
        myMovie.setDurationMinutes(120);
        myMovie.setIncludedPlan(true);
        myMovie.assess(10);
        myMovie.assess(8);
        myMovie.displaysTechnicalSheet();

        Movie otherMovie = new Movie("Divertidamente 2", 2024);
        otherMovie.setDurationMinutes(160);
        otherMovie.setIncludedPlan(true);
        otherMovie.assess(10);
        otherMovie.assess(8);
        otherMovie.displaysTechnicalSheet();

        Serie mySerie = new Serie("Teen Wolf", 2015);
        mySerie.setIncludedPlan(true);
        mySerie.setSeasons(6);
        mySerie.setEpisodesSeason(12);
        mySerie.setMinutesEpisode(25);
        mySerie.assess(10);
        mySerie.assess(8);
        mySerie.displaysTechnicalSheet();

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(mySerie);
        System.out.println(calculator.getTotalTime());

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(90);

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);
        filter.filter(episode);

        ArrayList<Movie> listMovies = new ArrayList<>();
        listMovies.add(myMovie);
        listMovies.add(otherMovie);
        System.out.println("Tamanho da lista: " + listMovies.size());
        System.out.println("Primeiro filme: " + listMovies.getFirst());
        System.out.println(listMovies);
        System.out.println("toString do filme: "+ listMovies.getFirst().toString());

    }
}
