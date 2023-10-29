/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan26waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk melihat waktu saat ini pada format tanggal di indonesoa
 */
        
public class TI_RegPagi22205043Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dapatkan waktu saat ini
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        Locale locale = new Locale("id", "ID");

        // Format waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", locale);

        // Tampilkan waktu
        System.out.println("Hari ini adalah hari : " + formatter.format(waktuSaatIni));
    }
    
}
