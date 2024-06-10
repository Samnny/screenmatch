package model;

import org.example.pasta.calculation.TimeCalculator;

public class Title extends TimeCalculator {
    private String name;
    private int yearRelease;
    private boolean includedPlan;
    private double sumRatings;
    private int totalAssessment;
    private int durationMinutes;

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
}
