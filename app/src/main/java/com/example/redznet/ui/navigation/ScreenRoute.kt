package com.example.redznet.ui.navigation

/**
 * Kerangka awal rute navigasi Compose untuk alur Admin dan User.
 * Daftar rute disesuaikan dengan layar yang ditetapkan di dokumen SRS.
 */
sealed class ScreenRoute(val route: String) {
    data object Login : ScreenRoute("login")
    data object Home : ScreenRoute("home")
}