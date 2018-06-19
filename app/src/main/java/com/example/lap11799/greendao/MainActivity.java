package com.example.lap11799.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    DaoSession daoSession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daoSession = ((MyApplication)getApplication()).getDaoSession();
        createMovie();
        listMovies();
    }
    public void createMovie() {
        // create Movie object
        int movieNum = (int)daoSession.getMovieDao().count();
        Movie movie1 = new Movie(null, "Movie" + String.valueOf(movieNum),(2000+movieNum));
        long movieID = daoSession.getMovieDao().insert(movie1);

    }
    public void listMovies() {
        List<Movie> movies = daoSession.getMovieDao().loadAll();
        for (Movie m : movies) {
            Log.d("TAG", String.format("%s (%s)", m.getTitle(), m.getYear()));
        }
    }
    public void deleteMovies() {
        daoSession.getMovieDao().deleteAll();
    }
}
