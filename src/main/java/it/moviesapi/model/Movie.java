package it.moviesapi.model;

import java.util.Date;

public class Movie {
    private int id;
    private String cover;
    private String[] genres;
    private Date releaseDate;
    private String title;
    private int duration;
    private TitleType titleType;
    private  Comment comment;

    public Movie(int id, String cover, String[] genres, Date releaseDate, String title, int duration, TitleType titleType, Comment comment) {
        this.id = id;
        this.cover = cover;
        this.genres = genres;
        this.releaseDate = releaseDate;
        this.title = title;
        this.duration = duration;
        this.titleType = titleType;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public TitleType getTitleType() {
        return titleType;
    }

    public void setTitleType(TitleType titleType) {
        this.titleType = titleType;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
