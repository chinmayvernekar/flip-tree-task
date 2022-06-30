package com.chinmay.fliptreetask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MCUModel {

    @Id
    @GeneratedValue
    private int id;

    private int movie_id;

    private String title;
    private String phase;
    private String category_name;
    private Long release_year;
    private Long running_time;
    private String rating_name;
    private String disc_format_name;
    private Long number_discs;
    private String viewing_format_name;
    private String aspect_ratio_name;
    private Long status;
    private String release_date;
    private String budget;
    private String gross;
    private String time_stamp;

    private String edition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Long getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Long release_year) {
        this.release_year = release_year;
    }

    public Long getRunning_time() {
        return running_time;
    }

    public void setRunning_time(Long running_time) {
        this.running_time = running_time;
    }

    public String getRating_name() {
        return rating_name;
    }

    public void setRating_name(String rating_name) {
        this.rating_name = rating_name;
    }

    public String getDisc_format_name() {
        return disc_format_name;
    }

    public void setDisc_format_name(String disc_format_name) {
        this.disc_format_name = disc_format_name;
    }

    public Long getNumber_discs() {
        return number_discs;
    }

    public void setNumber_discs(Long number_discs) {
        this.number_discs = number_discs;
    }

    public String getViewing_format_name() {
        return viewing_format_name;
    }

    public void setViewing_format_name(String viewing_format_name) {
        this.viewing_format_name = viewing_format_name;
    }

    public String getAspect_ratio_name() {
        return aspect_ratio_name;
    }

    public void setAspect_ratio_name(String aspect_ratio_name) {
        this.aspect_ratio_name = aspect_ratio_name;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
