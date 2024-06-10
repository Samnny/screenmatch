package model;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesSeason;
    private int minutesEpisode;

    public Serie(String name, int yearRelease) {
        super(name, yearRelease);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesSeason() {
        return episodesSeason;
    }

    public void setEpisodesSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public int getDurationMinutes() {
        return seasons * episodesSeason * minutesEpisode;
    }

    @Override
    public String toString() {
        return "Serie: "+ this.getName() + " (" + this.getYearRelease() + ")";
    }

}
