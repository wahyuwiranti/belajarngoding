package ProgramEkskursi;
/**
 *
 * @author asus pc
 */
class Mahasiswa extends User{
    String nama;
    String nim;
    String prodi;
    String TTL;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String prodi, String TTL) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.TTL = TTL;
    }
    
    
}
