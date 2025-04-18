﻿# Tugas-5-PPB-G

---

# Basic Calculator Android App

## Deskripsi
Aplikasi kalkulator sederhana yang dibuat menggunakan Jetpack Compose di Android. Aplikasi ini memungkinkan pengguna untuk melakukan operasi matematika dasar (penjumlahan, pengurangan, perkalian, dan pembagian) dengan dua nilai input.

## Fitur
- Input dua angka (Value A dan Value B)
- Operasi matematika: Tambah (+), Kurang (-), Kali (*), dan Bagi (/)
- Tombol Enter untuk menghitung hasil
- Tampilan hasil perhitungan
- Tombol Clear untuk mengatur ulang semua nilai
- Desain responsif dengan tema Material Design

## Cara Penggunaan
1. Masukkan angka pertama (Value A) menggunakan tombol angka
2. Pilih operasi matematika (Add, Sub, Mul, atau Div)
3. Masukkan angka kedua (Value B)
4. Tekan tombol "Enter" untuk melihat hasil
5. Tekan "Clear" untuk mengatur ulang kalkulator

## Struktur Kode
- **MainActivity.kt**: Kelas utama yang mengatur tampilan aplikasi menggunakan Jetpack Compose
- **SimpleCalculator()**: Composable function utama yang berisi:
  - Tampilan hasil (Result)
  - Kotak input untuk Value A dan Value B
  - Tombol angka (0-9)
  - Tombol operasi (Add, Sub, Mul, Div)
  - Tombol Clear dan Enter

## Teknologi
- **Bahasa**: Kotlin
- **UI Framework**: Jetpack Compose
- **Tema**: MaterialTheme (dengan custom warna ungu sesuai pada contoh latihan)

## Cara Menjalankan
1. Clone repository ini
2. Buka di Android Studio
3. Pastikan Anda memiliki emulator atau perangkat fisik yang terhubung
4. Klik "Run" untuk membangun dan menjalankan aplikasi

## Catatan
- Aplikasi menangani pembagian dengan nol dengan menampilkan "Error"
- Hasil otomatis dipindahkan ke Value A setelah perhitungan untuk operasi berulang
- Desain menggunakan warna ungu khas (customizable di kode)

---
