package com.example.redznet.model

/**
 * Kerangka awal model data 4 entitas utama Redz Net.
 * Field dan anotasi serialisasi disesuaikan dengan skema tabel Supabase & SRS.
 */
data class User(
    val id: String = "",
    val nama: String = "",
    val email: String = "",
    val role: String = ""
)

data class Station(
    val id: String = "",
    val nomorPc: String = "",
    val kategori: String = "",
    val status: String = ""
)

data class Paket(
    val id: String = "",
    val namaPaket: String = "",
    val durasiJam: Int = 0,
    val harga: Double = 0.0
)

data class Booking(
    val id: String = "",
    val userId: String = "",
    val stationId: String = "",
    val paketId: String = "",
    val statusBooking: String = ""
)