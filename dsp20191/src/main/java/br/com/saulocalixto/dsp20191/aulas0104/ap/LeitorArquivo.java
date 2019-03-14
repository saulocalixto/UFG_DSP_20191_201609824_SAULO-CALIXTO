package br.com.saulocalixto.dsp20191.aulas0104.ap;

import java.io.*;

/**
 * Created by aluno on 13/03/19.
 */
public class LeitorArquivo {
    public static void main (String args[]) throws IOException {

        criarArquivo();

        String fileName = "src/main/resources/texto.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }

    public static void criarArquivo() {
        try {
            File statText = new File("src/main/resources/texto.txt");
            if(!statText.exists())
                statText.createNewFile();
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("O Saulo é o maioral!");
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }
    }
}
