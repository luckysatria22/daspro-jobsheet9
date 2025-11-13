import java.util.Scanner;

public class NilaiMahasiswaXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input banyaknya nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMhs = sc.nextInt();
        
        // Deklarasi array untuk menyimpan nilai
        int[] nilaiMhs = new int[jumlahMhs];
        
        // Input nilai setiap mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        // Menghitung nilai rata-rata
        int total = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        double rataRata = (double) total / nilaiMhs.length;
        
        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        
        // Menampilkan hasil
        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        
        System.out.println("\nSemua nilai yang telah dimasukkan:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
        
        sc.close();
    }
}