import java.util.Scanner;

public class Soal_1_Sulit {

    public static  double hr(double total_nilai,int absen){

        double rata2 = total_nilai/absen;
        return rata2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total_nilai = 0, rata2 = 0;
        System.out.print("Masukkan jumlah siswa: ");
        int absen = input.nextInt();

        for (int i = 1; i <= absen; i++){
            System.out.print("Masukkan nilai siswa absen " + i + ": ");
            total_nilai += input.nextDouble();
        }

        rata2 = hr(total_nilai,absen);
        System.out.println("Nilai rata - rata dari seluruh siswa adalah: " + rata2);

    }
    
}
