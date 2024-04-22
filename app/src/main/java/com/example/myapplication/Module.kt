package com.example.myapplication

import android.app.Application
import androidx.room.Room
import com.example.myapplication.data.MainDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideMainDB(app: Application) : MainDB{
        return Room.databaseBuilder(
            app,
            MainDB::class.java,
            "products.DB"
        ).build()
    }
}