1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
dari program? Mengapa demikian?

Jawaban :

1. Program eror tidak bisa dijalankan, karena bil menggunakan tipe data int hanya bisa menyimpan bilangan bulat.
2. int[] bil = {5, 13, -7, 17};
3. Menggunakan perulangan yang otomatis, tidak perlu menulis sistem.out.ptintln 4 kali.
4. Saat program dijalankan, elemen dengan indeks 0 hingga 3 masih dapat ditampilkan dengan benar. Namun, ketika program mencoba mengakses indeks ke-4, akan muncul error dengan pesan: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4.