package principal;

import calculation.RecommendationFilter;
import calculation.TimeCalculator;
import model.Episode;
import model.Movie;
import model.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Your Name");
        myMovie.setYearRelease(2020);
        myMovie.setDurationMinutes(120);
        myMovie.setIncludedPlan(true);
        myMovie.assess(10);
        myMovie.assess(8);
        myMovie.displaysTechnicalSheet();

        Movie otherMovie = new Movie();
        otherMovie.setName("Divertidamente 2");
        otherMovie.setYearRelease(2024);

        Serie mySerie = new Serie();
        mySerie.setName("Teen Wolf");
        mySerie.setYearRelease(2015);
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
        System.out.println("Primeiro filme: " + listMovies.get(0));
        System.out.println(listMovies);
        System.out.println("toString do filme: "+ listMovies.get(0).toString());

    }
}
