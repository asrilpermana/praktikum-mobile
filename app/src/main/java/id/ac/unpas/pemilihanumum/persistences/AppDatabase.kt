package id.ac.unpas.pemilihanumum.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.pemilihanumum.model.KelasData

@Database(entities = [KelasData::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun KelasDataDao(): KelasDataDao
}