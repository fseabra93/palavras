/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palavras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author flaviorgs
 */
public class VerificadorDePalavras {
 
    private static final String CAMINHO_DICIONARIO = "dicionario.txt";
    private static Set<String> dicionario = new HashSet<>();

    // Método para carregar o dicionário do arquivo
    static void carregarDicionario() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_DICIONARIO));
        String palavra;
        while ((palavra = reader.readLine()) != null) {
            dicionario.add(palavra.trim().toLowerCase()); // Adiciona a palavra ao HashSet (convertendo-a para minúsculas)
        }
        reader.close();
    }

    // Método para verificar se uma palavra está no dicionário
    public static boolean palavraEstaNoDicionario(String palavra) {
        return dicionario.contains(palavra.toLowerCase()); // Verifica se a palavra está no HashSet (convertendo-a para minúsculas)
    }
    
}
