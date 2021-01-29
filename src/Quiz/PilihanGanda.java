/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.io.*;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author zicoa
 */
public class PilihanGanda implements Soal {

    private String jawaban;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;

    public PilihanGanda() {
    }

    public PilihanGanda(String jawaban, String OptionA, String OptionB, String OptionC, String OptionD) {
        this.jawaban = jawaban;
        this.OptionA = OptionA;
        this.OptionB = OptionB;
        this.OptionC = OptionC;
        this.OptionD = OptionD;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public String getOptionA() {
        return OptionA;
    }

    public void setOptionA(String OptionA) {
        this.OptionA = OptionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public void setOptionB(String OptionB) {
        this.OptionB = OptionB;
    }

    public String getOptionC() {
        return OptionC;
    }

    public void setOptionC(String OptionC) {
        this.OptionC = OptionC;
    }

    public String getOptionD() {
        return OptionD;
    }

    public void setOptionD(String OptionD) {
        this.OptionD = OptionD;
    }

    @Override
    public void checkJawaban() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showSoal() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader(getPath());
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception err) {
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        String data = bufferInput.readLine();

        Scanner terminalInput = new Scanner(System.in);
        String jawaban[] = new String[100];
        int nomorData = 0;

        while (data != null) {

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            System.out.printf("(%d)\n", nomorData + 1);

            if (stringToken.nextToken().equalsIgnoreCase("pilgan")) {
                System.out.println(stringToken.nextToken());
                System.out.println("A. " + stringToken.nextToken());
                System.out.println("B. " + stringToken.nextToken());
                System.out.println("C. " + stringToken.nextToken());
                System.out.println("D. " + stringToken.nextToken());
                System.out.println("E. " + stringToken.nextToken());
                System.out.println("Jawaban : ");
                jawaban[nomorData] = terminalInput.nextLine();
//                if (stringToken.nextToken().equalsIgnoreCase(jawaban[nomorData])) {
//                    this.nilai += 1;
//                }
                System.out.print("\n");
            } else {
                System.out.println(stringToken.nextToken());
                System.out.println("A. " + stringToken.nextToken());
                System.out.println("B. " + stringToken.nextToken());
                System.out.println("Jawaban : ");
                jawaban[nomorData] = terminalInput.nextLine();
//                if (stringToken.nextToken().equalsIgnoreCase(jawaban[nomorData])) {
//                    this.nilai += 1;
//                }
                System.out.print("\n");
            }

            data = bufferInput.readLine();

            nomorData++;
        }

//        FileWriter fileOutput = new FileWriter(this.getPathNilai(), true);
//        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
//        float hasil = (nilai * 100 / nomorData) ;
//        boolean isTambah = utils.getYesOrNo("Apakah akan ingin menambah data tersebut? ");
//        if (isTambah) {
//            bufferOutput.write(bio1.getNama() + "," + bio1.getNim() + "," + Double.toString(hasil));
//            bufferOutput.newLine();
//            bufferOutput.flush();
//        }
        System.out.println("NILAI AKHIR ANDA => " + nomorData);
    }

    @Override
    public String getPath() {
        return dataPath; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) throws IOException{
        PilihanGanda pil = new PilihanGanda();
        
        pil.showSoal();
    }

}
