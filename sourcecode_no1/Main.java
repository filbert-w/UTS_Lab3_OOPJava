//class
class Mahasiswa {
    String nama;
    String nim;

    //constructor
    Mahasiswa(){
        this.nama = "kosong";
        this.nim = "kosong";
    }

    //method overloading
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    //method setter
    void inputDataMahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    //method getter
    String ambilNamaMahasiswa(){
        return this.nama;
    }

}

public class Main {
    public static void main(String[] args) {
        //object
       Mahasiswa mahasiswa = new Mahasiswa();

       mahasiswa.nama = "Filbert";
       mahasiswa.nim = "211401045";

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nim);
    }
}