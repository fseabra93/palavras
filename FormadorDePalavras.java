/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palavras;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author flaviorgs
 */
public class FormadorDePalavras {
    
    // Método para formar palavras com as letras fornecidas
    public static Set<String> formarPalavras(ArrayList<Character> letras, Set<String> dicionario) {
        Set<String> palavrasFormadas = new HashSet<>();
        permutarLetras(letras, "", palavrasFormadas);
        palavrasFormadas.retainAll(dicionario); // Mantém apenas as palavras que estão no dicionário
        return palavrasFormadas;
    }

    // Método recursivo para permutar as letras e formar todas as combinações possíveis
    private static void permutarLetras(ArrayList<Character> letrasRestantes, String palavraAtual, Set<String> palavrasFormadas) {
        if (letrasRestantes.isEmpty()) {
            palavrasFormadas.add(palavraAtual);
            return;
        }
        for (int i = 0; i < letrasRestantes.size(); i++) {
            char letra = letrasRestantes.get(i);
            ArrayList<Character> letrasRestantesAtualizadas = new ArrayList<>(letrasRestantes);
            letrasRestantesAtualizadas.remove(i);
            permutarLetras(letrasRestantesAtualizadas, palavraAtual + letra, palavrasFormadas);
        }
    }
    
}
