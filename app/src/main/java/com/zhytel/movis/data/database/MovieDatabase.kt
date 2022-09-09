package com.zhytel.movis.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.zhytel.movis.domain.FavouriteMovie
import com.zhytel.movis.domain.Movie


@Database(entities = [Movie::class, FavouriteMovie::class], version = 1, exportSchema = false)
abstract class MovieDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object {

        private const val DB_NAME = "movies.db"
        private var database: MovieDatabase? = null
        private val LOCK = Any()

        fun getInstance(context: Context): MovieDatabase {
            synchronized(LOCK) {
                database?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        MovieDatabase::class.java,
                        DB_NAME
                    ).fallbackToDestructiveMigration().build()
                database = instance
                return instance
            }
        }
    }
}