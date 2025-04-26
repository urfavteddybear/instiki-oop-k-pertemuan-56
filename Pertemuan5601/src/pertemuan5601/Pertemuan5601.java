/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author Wahyu Putra
 * 26.04.2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ini adalah instance
        manusia budi = new manusia("L");
        budi.warnakulit = "brown";
        budi.SetWarnaRambut("hitam");
        
        // ini adalah instance
        manusia amimir = new manusia("P");
        amimir.warnakulit = "white";
        amimir.SetWarnaRambut("black");
        
        // ini adalah instance
        manusia alo = new manusia("L");
        alo.warnakulit = "brown";
        alo.SetWarnaRambut("white");
    }
    
}

class manusia {
    public String warnakulit = "";
    private String warnarambut = "";
    private String jeniskelamin = "";
    
    // ini adalah constructor ( sifatnya optional )
    public manusia(String jk){
        // "this" merujuk pada class ini
        this.jeniskelamin = jk;
    }
    
    public void SetWarnaRambut(String warna){
        this.warnarambut = warna;
    }
}
