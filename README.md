Redz Net — Aplikasi Reservasi iCafe (Android)
=============================================

Aplikasi mobile reservasi iCafe **Redz Net** berbasis **Kotlin** dan **Jetpack Compose** dengan arsitektur **MVVM**, terhubung ke **REST API Supabase (PostgreSQL)** dengan autentikasi **JWT** serta penyimpanan bukti reservasi menggunakan **Android File Storage** (tanpa Room Database).

**Identitas & Repositori**
- **Pengembang:** M. Zidane Al Hakim S. (`20240140084`, Kelas B)
- **Repositori Mobile (Public):** `0084_RedzNet`
- **Repositori Backend / SQL (Public):** `0084_API_RedzNet`

**Tech Stack & Aturan Teknis**
- **UI & Bahasa:** Kotlin, Jetpack Compose
- **Arsitektur:** MVVM (`data`, `model`, `network`, `ui`, `utils`, `viewmodel`)
- **Backend & Database:** REST API Supabase / PostgreSQL (tanpa Room DB)
- **Autentikasi:** JWT (`Admin` dan `User`)
- **Bukti Reservasi:** Android File Storage

**Hak Akses Pengguna**
- **Admin:** Mengelola data station, paket, melihat/memverifikasi reservasi pengguna, serta memantau status sistem sesuai hak akses JWT.
- **User:** Melakukan registrasi/login, melihat daftar station dan paket, membuat reservasi, mengunggah/menyimpan bukti reservasi, serta memantau status reservasi miliknya.

**Entitas Utama & Alur CRUDS**
Sistem berpusat pada 4 entitas utama dengan alur CRUDS (*Create, Read, Update, Delete, Search/Filter*) sesuai kebutuhan fitur dan peran:
1. **`users`** — Data pengguna dan kredensial/peran (`admin` / `user`).
2. **`stations`** — Data unit PC/meja iCafe beserta kategori dan status ketersediaan.
3. **`pakets`** — Data paket layanan/durasi/tarif reservasi.
4. **`bookings`** — Data transaksi reservasi yang menghubungkan `users`, `stations`, dan `pakets`, lengkap dengan status serta bukti reservasi.

**Struktur Paket MVVM (`com.example.redznet`)**
- `data` — Repository penghubung `ViewModel` ke REST API Supabase dan Android File Storage.
- `model` — Model data entitas (`User`, `Station`, `Paket`, `Booking`) dan struktur data API.
- `network` — Konfigurasi klien jaringan, penyisipan token JWT, dan endpoint REST API.
- `ui` — Tampilan Compose (`navigation`, `theme`, komponen/layar UI).
- `utils` — Konstanta sistem dan utilitas pendukung.
- `viewmodel` — Pengelola state UI dan alur aksi pengguna/admin.

**Progress Mingguan**
- **Minggu 1:**
    - `a3d5bd0` — `inisialisasi proyek jetpack compose redz net`
    - `be5475a` — `buat struktur paket mvvm dan konstanta dasar`