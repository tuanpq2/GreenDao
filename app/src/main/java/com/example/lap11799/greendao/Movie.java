package com.example.lap11799.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;


@Entity
public class Movie {
    @Id
    private Long id;
    @NotNull
    private String title;
    private int year;
    @Generated(hash = 751934171)
    public Movie(Long id, @NotNull String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }
    @Generated(hash = 1263461133)
    public Movie() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
