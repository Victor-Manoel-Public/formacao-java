package testes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MultiplasPessoas {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/victor/java/jdev/datas/src/testes/multiplas_pessoas.txt");
        Pessoa pessoa1 = new Pessoa("pessoa1", "pessoa1@email.com", 18);
        Pessoa pessoa2 = new Pessoa("pessoa2", "pessoa2@gmail.com", 55);
        Pessoa pessoa3 = new Pessoa("pessoa3", "pessoa3@email.com", 18);
        Pessoa pessoa4 = new Pessoa("pessoa4", "pessoa4@gmail.com", 55);
        Pessoa pessoa5 = new Pessoa("pessoa5", "pessoa5@email.com", 18);
        Pessoa pessoa6 = new Pessoa("pessoa6", "pessoa6@gmail.com", 55);

        if(!file.exists()) {
            file.createNewFile();
        }

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        FileWriter fileWriter = new FileWriter(file);

        for(Pessoa p : pessoas){
            fileWriter.write(String.format("%s;%s;%d\n", p.getNome(), p.getEmail(), p.getIdade()));
        }

        fileWriter.flush();
        fileWriter.close();

    }
}
