package id.ac.unpas.pemilihanumum.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class KelasData(
    @PrimaryKey val id: String,
    val nik: String,
    val nama: String,
    val tanggal: String,
    val domisili: String
) {
    fun insertAll(item: KelasData) {
        TODO("Not yet implemented")
    }
}
