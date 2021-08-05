/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import my.usaha.*;

/**
 *
 * @author User
 */
public class daftarperusahaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dataperusahaan perusahaan = new dataperusahaan("smk 5 telkom", "jl. I.H.JUANDA", "0065-5677546");
        
        System.out.println("\n");
        System.out.println("data perusahaan kami");
        System.out.println("---------------------");
        System.out.println("namaa :" + perusahaan.bacanama());
        System.out.println("alamat :" + perusahaan.bacaalamat() );
        System.out.println("telepon :" + perusahaan.bacatelepon());
        System.out.println("profinsi :" + perusahaan.bacaprofinsi());
        System.out.println("kota  :"+   perusahaan.bacakota());
    }
    
}
