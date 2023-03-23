package id.ac.unpas.pemilihanumum.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.pemilihanumum.model.KelasData

@Dao
interface KelasDataDao {
    @Query("SELECT * FROM KelasData")
    fun loadAll(): LiveData<List<KelasData>>

    @Query("SELECT * FROM KelasData WHERE id = :id")
    fun find(id: String): KelasData?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: KelasData)

    @Delete
    fun delete(item: KelasData)

    companion object {
        fun loadAll(): LiveData<List<KelasData>> {
            TODO("Not yet implemented")
        }
    }
}