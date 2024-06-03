package collections3;

import java.time.LocalDate;


class Movie implements Comparable<Movie> {
    private String name;
    private String language;
    private LocalDate releaseDate;
    private String director;
    private String producer;
    private int duration;

    public Movie(String name, String language, LocalDate releaseDate, String director, String producer, int duration) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Movie other) {
        return this.language.compareTo(other.language);
    }
}

