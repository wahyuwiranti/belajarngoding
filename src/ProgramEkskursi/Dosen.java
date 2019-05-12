/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramEkskursi;
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
}

