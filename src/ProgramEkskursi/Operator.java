
package ProgramEkskursi;

/**
 *
 * @author ILHAM
 */
class Operator extends User{
    String nama;
    String nrk;
    String prodi;
    String TTL;

    public Operator() {
    }
    public Operator(String nama, String nrk, String prodi, String TTL) {
        this.nama = nama;
        this.nrk = nrk;
        this.prodi = prodi;
        this.TTL = TTL;
    } 
}
