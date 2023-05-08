import java.util.Scanner;

class Fotolistrik {
    double energiFoton;
    double nilaiKonstantaPlanck = 6.63*Math.pow(10, -34);
    double frekuensiCahaya;
    int jumlahFoton;

    Fotolistrik(double frekuensiCahaya){
        this.frekuensiCahaya = frekuensiCahaya;
        this.jumlahFoton = 1;
        hitungEnergiFoton();
    }

    Fotolistrik(double frekuensiCahaya, int jumlahFoton){
        this.frekuensiCahaya = frekuensiCahaya;
        this.jumlahFoton = jumlahFoton;
        hitungEnergiFoton(jumlahFoton);
    }

    void hitungEnergiFoton(){
        energiFoton = nilaiKonstantaPlanck * frekuensiCahaya;
    }

    void hitungEnergiFoton(int jumlahFoton){
        energiFoton = nilaiKonstantaPlanck * frekuensiCahaya * jumlahFoton;
    }
}

class BungaMajemuk {
    double nilaiAkhir;
    double nilaiAwal;
    double persenSukuBunga;
    double jangkaWaktu;

    BungaMajemuk(double nilaiAwal, double persenSukuBunga){
        this.nilaiAwal = nilaiAwal;
        this.persenSukuBunga = persenSukuBunga;
        this.jangkaWaktu = 1;
        hitungNilaiAkhir();
    }

    BungaMajemuk(double nilaiAwal, double persenSukuBunga, double jangkaWaktu){
        this.nilaiAwal = nilaiAwal;
        this.persenSukuBunga = persenSukuBunga;
        this.jangkaWaktu = jangkaWaktu;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir(){
        nilaiAkhir = nilaiAwal * Math.pow((1 + persenSukuBunga/100), jangkaWaktu);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung rumus fotolistrik (fisika) dan bunga majemuk (matematika)");
        System.out.println("1. Fotolistrik (fisika)\n2. Bunga majemuk (matematika)");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.println("Menghitung rumus fotolistrik (fisika)");
            System.out.println("1. Jumlah foton default (1 foton)\n2. Jumlah foton spesifik");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            if(pilihan == 1){
                System.out.print("Frekuensi cahaya: ");
                double frekuensiCahaya = input.nextDouble();
                Fotolistrik fotolistrik = new Fotolistrik(frekuensiCahaya);
                System.out.println("Energi foton yang didapat adalah "+fotolistrik.energiFoton);
            } else if(pilihan == 2){
                System.out.print("Frekuensi cahaya: ");
                double frekuensiCahaya = input.nextDouble();
                System.out.print("Jumlah foton: ");
                int jumlahFoton = input.nextInt();
                Fotolistrik fotolistrik = new Fotolistrik(frekuensiCahaya, jumlahFoton);
                System.out.println("Energi foton yang didapat adalah "+fotolistrik.energiFoton);
            }

        } else if(pilihan == 2){
            System.out.println("Menghitung bunga majemuk (matematika)");
            System.out.println("1. Jangka waktu default (1 tahun)\n2. Jangka waktu spesifik");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            if(pilihan == 1){
                System.out.print("Nilai awal: ");
                double nilaiAwal = input.nextDouble();
                System.out.print("Persen suku bunga: ");
                double persenSukuBunga = input.nextDouble();
                BungaMajemuk bungaMajemuk = new BungaMajemuk(nilaiAwal, persenSukuBunga);
                System.out.print("Nilai akhir yang didapat adalah ");
                System.out.printf("%.2f", bungaMajemuk.nilaiAkhir);
            } else if(pilihan == 2){
                System.out.print("Nilai awal: ");
                double nilaiAwal = input.nextDouble();
                System.out.print("Persen suku bunga: ");
                double persenSukuBunga = input.nextDouble();
                System.out.print("Jangka waktu (tahun): ");
                double jangkaWaktu = input.nextDouble();
                BungaMajemuk bungaMajemuk = new BungaMajemuk(nilaiAwal, persenSukuBunga, jangkaWaktu);
                System.out.print("Nilai akhir yang didapat adalah ");
                System.out.printf("%.2f", bungaMajemuk.nilaiAkhir);
            }
        } else {
            System.out.println("Pilihan tidak ada");
        }

    }
}