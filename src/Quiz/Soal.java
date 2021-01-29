/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.io.*;

/**
 *
 * @author zicoa
 */
public interface Soal {

    public static final String dataPath = "src/Quiz/soal.txt";

    void checkJawaban() throws IOException;

    void showSoal() throws IOException;
    
    abstract String getPath();
}
