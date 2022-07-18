/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class geometri {
    public static void main(String[]agrs){
        segitiga segi3 = new segitiga();
        
        segi3.sisi1 = (3);
        segi3.sisi2 = (4);
        segi3.alas  = (10);
        segi3.tinggi = (30);
         System.out.println("===========================================");
         System.out.println("          SEGITIGA            <-- NAMA CLASS   ");
        System.out.println("===========================================");
        System.out.println("sisi 1            = "+segi3.sisi1+"       <-- ATRIBUTE  ");
        System.out.println("sisi 2            = "+segi3.sisi2+"       <-- ATRIBUTE  ");
        System.out.println("alas              = "+segi3.alas+"      <-- ATRIBUTE  ");
        System.out.println("tinggi            = "+segi3.tinggi+"      <-- ATRIBUTE  ");
        System.out.println("keliling segitiga = "+segi3.keliling_segi3()+"      <-- METHOD  ");
        System.out.println("luas segitiga     = "+segi3.luas_segi3()+"     <-- METHOD  ");
    
        lingkaran l =    new lingkaran();
        l.pi  =(3.14);
        l.r =(12.2);
         System.out.println("===========================================");
        System.out.println("         LINGKARAN                <-- NAMA CLASS        ");
        System.out.println("===========================================");
        System.out.println("pi                  = "+l.pi+"        <-- ATRIBUTE  ");
        System.out.println("r                   = "+l.r+"        <-- ATRIBUTE  ");
        System.out.println("keliling lingkaran  = "+l.keliling_lingkaran()+"      <-- METHOD  ");
        System.out.println("luas lingkaran      = "+l.luas_lingkaran()+"    <-- METHOD  ");
        
        trapesium t = new trapesium();
        t.panjang_AB  =(14);
        t.panjang_BC  =(12);
        t.panjang_DA  =(12);
        t.panjang_CD  =(18);
        t.tinggi      = (10);
         System.out.println("===========================================");
          System.out.println("          TRAPESIUM                 <-- NAMA CLASS           ");
        System.out.println("===========================================");
        System.out.println("panjang rusuk AB         = "+t.panjang_AB+"     <-- ATRIBUTE  ");
        System.out.println("panjang rusuk BC         = "+t.panjang_BC+"     <-- ATRIBUTE  ");
        System.out.println("panjang rusuk CD         = "+t.panjang_CD+"     <-- ATRIBUTE  ");
        System.out.println("panjang rusuk DA         = "+t.panjang_DA+"     <-- ATRIBUTE  ");
        System.out.println("tinggi                   = "+t.tinggi+"     <-- ATRIBUTE  ");
        System.out.println("keliling trapeisum       = "+t.keliling_t()+"     <-- METHOD  ");
        System.out.println("luas trapeium            = "+t.luas_t()+"    <-- METHOD  ");
        
        
    
    }
}
