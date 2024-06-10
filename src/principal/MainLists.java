package principal;

import model.Movie;
import model.Serie;
import model.Title;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {

        Movie yourName = new Movie("Your Name", 2020);
        yourName.assess(10);

        Movie insideOut = new Movie("Inside Out 2", 2024);
        insideOut.assess(9);

        Movie garfield = new Movie("Garfield", 2024);
        garfield.assess(9);

        Serie teenWolf = new Serie("Teen Wolf", 2015);

        ArrayList<Title> list = new ArrayList<>();
        list.add(yourName);
        list.add(insideOut);
        list.add(garfield);
        list.add(teenWolf);

        for (Title title : list){
            System.out.println(title);

            if (title instanceof Movie movie) {
                System.out.println("Classification: " + movie.getClassification());
            }
        }
    }
}
