package ProgramEkskursi;
//import java.util.HashMap;
import java.sql.*;
class KumpulanMahasiswa extends Mahasiswa {
    //HashMap<String,Mahasiswa> DataMhs=new HashMap();
    String query;    
    public void DaftarMhs(Mahasiswa p){
        query="INSERT INTO mahasiswa values ('"+p.nim+"','"+p.nama+"','"+p.TTL+"','"+p.prodi+"','"+p.nim+"','"+p.TTL+"')";
        try{
            System.out.println(query);
            PreparedStatement stat=konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    public void UpdateMhs(Mahasiswa p){
        query="UPDATE `mahasiswa` SET `nama`='"+p.nama+"',`TTL`='"+p.TTL+"',`prodi`='"+p.prodi+"' WHERE `mahasiswa`.`NIM`='"+p.nim+"'";
        try{
            PreparedStatement stat=(PreparedStatement) konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    public void DeleteMhs(String NIM){
        query="DELETE FROM mahasiswa WHERE NIM='"+NIM+"'";
        try{
            PreparedStatement stat=(PreparedStatement) konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    //public abstract void LoadAll();
}