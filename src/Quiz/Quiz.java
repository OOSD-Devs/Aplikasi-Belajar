/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zicoa
 */
public class Quiz {

    ArrayList<PilihanGanda> pilihanGanda;
    ArrayList<TrueFalse> trueFalse;
    private int nilai = 0;

    public void tampilkanSoal() throws IOException {

        PilihanGanda pilgan = new PilihanGanda();
        TrueFalse trufal = new TrueFalse();

        pilihanGanda = pilgan.showSoal();
        trueFalse = trufal.showSoal();

        float jumlahsoal = pilihanGanda.size() + trueFalse.size();
        float hasil;
        
        Scanner terminalInput = new Scanner(System.in);

        String jawaban = new String();

        for (PilihanGanda barang : pilihanGanda) {
            System.out.println(barang.getId() + ". " + barang.getSoal());
            System.out.println("a) " + barang.getOptionA());
            System.out.println("b) " + barang.getOptionB());
            System.out.println("c) " + barang.getOptionC());
            System.out.println("d) " + barang.getOptionD());
            System.out.println("e) " + barang.getOptionE());
            System.out.println(barang.getJawaban());
            jawaban = terminalInput.next();
            if (pilgan.checkJawaban(jawaban, barang.getJawaban())) {
                nilai += 1;
            };
        }

        for (TrueFalse barang : trueFalse) {
            System.out.println(barang.getId() + ". " + barang.getSoal());
            System.out.println("a) " + barang.getOptionA());
            System.out.println("b) " + barang.getOptionB());
            System.out.println(barang.getJawaban());
            jawaban = terminalInput.next();
            if (trufal.checkJawaban(jawaban, barang.getJawaban())) {
                nilai += 1;
            };
        }

        hasil = (nilai * 100 / jumlahsoal) ;
        
        System.out.println("Nilai Anda => " + hasil);
    }

}
