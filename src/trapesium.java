/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class trapesium {
    public double panjang_AB;
    public double panjang_BC;
    public double panjang_CD;
    public double panjang_DA;
    public double tinggi;
    
    public double keliling_t(){
     return panjang_AB+panjang_BC+panjang_CD+panjang_DA;
    }

public double luas_t(){
    return  ((panjang_AB+panjang_BC)*tinggi)/0.5;
}

}

