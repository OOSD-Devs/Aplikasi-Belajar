/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibelajar;
import Quiz.*;
import java.io.IOException;
/**
 *
 * @author zicoa
 */
public class AplikasiBelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        PilihanGanda pil = new PilihanGanda();
        
        pil.showSoal();
    }
    
}