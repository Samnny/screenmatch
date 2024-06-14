package model;

import com.google.gson.annotations.SerializedName;
import exception.YearConversionException;

public class Title implements Comparable<Title>{

    @SerializedName("Title")
    private String name;

    @SerializedName("Year")
    private int yearRelease;


    private boolean includedPlan;
    private double sumRatings;
    private int totalAssessment;
    private int durationMinutes;

    public Title(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public Title(TitleOmdb titleOmdb) {
        this.name = titleOmdb.title();

        if (titleOmdb.year().length() > 4) {
            throw new YearConversionException("Não consegui converter o ano.");
        }
        this.yearRelease = Integer.parseInt(titleOmdb.year());
        this.durationMinutes = Integer.parseInt(titleOmdb.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public double getSumRatings() {
        return sumRatings;
    }

    public int getTotalAssessment() {
        return totalAssessment;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void displaysTechnicalSheet() {
        String text = """
               Movie: %s
               Release year: %d
               Included in the plan: %s
               Assessment: %.1f
               Duration in minutes: %d
        """.formatted(name, yearRelease, includedPlan, calculateEvaluationAverages(), getDurationMinutes());
        System.out.println(text);
    }

    public void assess(double note) {
        sumRatings += note;
        totalAssessment++;
    }

    double calculateEvaluationAverages () {
        return sumRatings/totalAssessment;
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", yearRelease=" + yearRelease +
                ", includedPlan=" + includedPlan +
                ", sumRatings=" + sumRatings +
                ", totalAssessment=" + totalAssessment +
                ", durationMinutes=" + durationMinutes +
                '}';
    }

    @Override
    public int compareTo(Title otherMovie) {
        return this.getName().compareTo(otherMovie.getName());
    }
}
