package com.zhytel.movis.data.database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zhytel.movis.domain.FavouriteMovie
import com.zhytel.movis.domain.Movie

interface MovieDao {
    @Query("SELECT * FROM movies")
    fun getAllMovies(): LiveData<List<Movie>>

    @Query("SELECT * FROM favourite_movies")
    fun allFavouriteMovies(): LiveData<List<FavouriteMovie>>

    @Query("SELECT * FROM movies WHERE id == :movieId")
    fun getMovieById(movieId: Int): Movie

    @Query("SELECT * FROM favourite_movies WHERE id == :movieId")
    fun getFavouriteMovieById(movieId: Int): FavouriteMovie

    @Query("DELETE FROM movies")
    fun deleteAllMovies()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movies: List<Movie>)

    @Delete
    fun deleteMovie(movie: Movie)

    @Insert
    fun insertFavouriteMovie(movie: FavouriteMovie)

    @Delete
    fun deleteFavouriteMovie(movie: FavouriteMovie)
}