package com.example.redznet.viewmodel

/**
 * Kerangka awal lapisan ViewModel Redz Net.
 * Setiap modul fitur (Auth, Station, Paket, Booking) akan memiliki ViewModel
 * dengan state terstruktur sesuai alur pada SRS.
 */
class RedzNetUiState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)