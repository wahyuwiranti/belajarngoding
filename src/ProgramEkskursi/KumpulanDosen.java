package ProgramEkskursi;
//import java.util.HashMap;
import java.sql.*;
class KumpulanDosen extends Dosen{
    //HashMap<String,Dosen> DataDsn=new HashMap();
    String query;    
    public void DaftarDosen(Dosen p){
        query="INSERT INTO dosen values ('"+p.nip+"','"+p.nama+"','"+p.TTL+"','"+p.prodi+"','"+p.nip+"','"+p.TTL+"')";
        try{
            System.out.println(query);
            PreparedStatement stat=konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    public void UpdateDosen(Dosen p){
        query="UPDATE `dosen` SET `nama`='"+p.nama+"',`TTL`='"+p.TTL+"',`prodi`='"+p.prodi+"' WHERE `dosen`.`NIP`='"+p.nip+"'";
        try{
            PreparedStatement stat=(PreparedStatement) konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    public void DeleteDosen(String NIP){
        query="DELETE FROM dosen WHERE NIP='"+NIP+"'";
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
