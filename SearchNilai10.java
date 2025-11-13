import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();
        int[] arrNilai = new int[n];
        int key;
        int hasil = 0; 
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin di cari : ");
        key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arrNilai[i]) {
                hasil = (i+1);
                break; 
            }
        }
        System.out.println();
        System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
       
        sc.close();
    }
}
