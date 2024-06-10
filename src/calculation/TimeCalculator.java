package calculation;

import model.Title;

public class TimeCalculator {
    private int totalTime;
    public int getTotalTime () {
        return totalTime;
    }

    //Sobrecarga de métodos
//    public void includes (Movie movie) {
//        this.totalTime += movie.getDurationMinutes();
//    }
//
//    public void includes (Serie serie) {
//        this.totalTime += serie.getDurationMinutes();
//    }

    public void includes (Title title) {
        //System.out.println("Adicionando duração em minutos de: "+title);
        this.totalTime += title.getDurationMinutes();
    }
}
