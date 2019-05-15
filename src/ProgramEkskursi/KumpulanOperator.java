package ProgramEkskursi;
import java.sql.*;
public class KumpulanOperator extends Operator {
    //HashMap<String,Dosen> DataDsn=new HashMap();
    String query;    
    public void DaftarOperator(Operator p){
        query="INSERT INTO operator values ('"+p.nrk+"','"+p.nama+"','"+p.TTL+"','"+p.prodi+"','"+p.nrk+"','"+p.TTL+"')";
        try{
            System.out.println(query);
            PreparedStatement stat=konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    public void UpdateOperator(Operator p){
        query="UPDATE `operator` SET `nama`='"+p.nama+"',`TTL`='"+p.TTL+"',`prodi`='"+p.prodi+"' WHERE `dosen`.`NRK`='"+p.nrk+"'";
        try{
            PreparedStatement stat=(PreparedStatement) konek.prepareStatement(query);
            stat.executeUpdate();
            System.out.println("Update Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Gagal eksekusi query");
        }
    }
    
    public void DeleteOperator(String NRK){
        query="DELETE FROM operator WHERE NRK='"+NRK+"'";
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
