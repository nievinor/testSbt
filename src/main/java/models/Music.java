package models;

import java.io.Serializable;

public class Music implements Serializable {

    private String name;
    private String author;
    private int year;

    public Music() {
    }

    public Music(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Music : { \"name : \"" + name
                + " \"author : \"" + author
                + " \"year : \"" + year + "}";
    }
}
