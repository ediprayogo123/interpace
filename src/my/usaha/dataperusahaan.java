/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.usaha;

/**
 *
 * @author User
 */
public class dataperusahaan implements profilperusahaan{
    String nama, alamat, telepon;
    
    
    public dataperusahaan (String nama, String alamat, String telepon ){
        this.nama  = nama;
        this.alamat =alamat;
        this.telepon =telepon;
        
    }

    @Override
    public String bacanama() {
        return nama; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bacaalamat() {
        return alamat; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bacatelepon() {
        return telepon; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String bacaprofinsi(){
        return PROVINSI;
    }
    
    public String bacakota(){
        return KOTA;
        
    }
    
}
