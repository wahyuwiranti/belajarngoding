package ProgramEkskursi;

import static ProgramEkskursi.User.konek;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author asus pc
 */
class Dosen extends User{
    String nama;
    String nip;
    String prodi;
    String TTL;

    public Dosen() {
    }
    public Dosen(String nama, String nip, String prodi, String TTL) {
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
        this.TTL = TTL;
    }
    
    public Dosen(String nip) throws SQLException {
        ResultSet m=konek.createStatement().executeQuery("SELECT * FROM `dosen` where NIP='"+nip+"'");
        if(m.next()){
            this.nama = m.getString("nama");
            this.nip = nip;
            this.prodi = m.getString("prodi");
            this.TTL = m.getString("TTL");
        }
    }
}