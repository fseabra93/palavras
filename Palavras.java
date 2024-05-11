/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palavras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import static palavras.VerificadorDePalavras.palavraEstaNoDicionario;

/**
 *
 * @author flaviorgs
 */
public class Palavras {
    
    public static int calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não é definido para números negativos");
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    
    
    public static void formarPalavras(List<String> lista) {
        
        try {
                VerificadorDePalavras.carregarDicionario(); // Carrega o dicionário do arquivo
        } catch (IOException e) {
                System.err.println("Erro ao carregar o dicionário: " + e.getMessage());
        }

        Set<String>set_teste = new TreeSet<>();
        String central = lista.get(6);
        
        //Combinações de n k a k com repetição: C(n+(k−1),k) => C = (n+(k-1))! / k!.((n+(k-1))-k)!
        // n = 7 e k = numero de letras
        //int numerador = calcularFatorial(7+(k-1));
       // int denominador = calcularFatorial(k)*calcularFatorial((7+(k-1))-k);
       // int combinacoes =   numerador / denominador;
        String palavra_teste = null;
        
        System.out.println("Deseja procurar palavras de quantas letras? (máximo 12) ");
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        
        int inicio = 4;
        int fim = tam;
        int cont = inicio;
        int total = 0;
             
        while (cont <= fim){

            
            if (cont == 4){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                palavra_teste = letra1 + letra2 + letra3 + letra4;
                                if (palavra_teste.contains(central)){
                                       if (palavraEstaNoDicionario(palavra_teste)) {
                                            set_teste.add(palavra_teste);
                                       }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }

            
            if (cont == 5){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    palavra_teste = letra1 + letra2 + letra3 + letra4 + letra5;
                                    if (palavra_teste.contains(central)){
                                           if (palavraEstaNoDicionario(palavra_teste)) {
                                                set_teste.add(palavra_teste);
                                           }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }
            

            
            if (cont == 6){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6;
                                        if (palavra_teste.contains(central)){
                                               if (palavraEstaNoDicionario(palavra_teste)) {
                                                    set_teste.add(palavra_teste);
                                               }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }
            

            
            if (cont == 7){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        for (String letra7 : lista){
                                            palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6 + letra7;
                                            if (palavra_teste.contains(central)){
                                                   if (palavraEstaNoDicionario(palavra_teste)) {
                                                        set_teste.add(palavra_teste);
                                                   }
                                            }                                           
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }
            

            
            if (cont == 8){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3: lista){
                            for (String letra4 : lista ){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        for (String letra7 : lista){
                                            for (String letra8 : lista){
                                                palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6 + letra7 + letra8;
                                                if (palavra_teste.contains(central)){
                                                       if (palavraEstaNoDicionario(palavra_teste)) {
                                                            set_teste.add(palavra_teste);
                                                       }
                                                }                                                  
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }
            

            
            if (cont == 9){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        for (String letra7: lista){
                                            for (String letra8 : lista){
                                                for (String letra9: lista){
                                                    palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6 + letra7+ letra8 + letra9;
                                                    if (palavra_teste.contains(central)){
                                                           if (palavraEstaNoDicionario(palavra_teste)) {
                                                                set_teste.add(palavra_teste);
                                                           }
                                                    }                                                     
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();               
            }
            

            
            if (cont == 10){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        for (String letra7: lista){
                                            for (String letra8 : lista){
                                                for (String letra9 : lista){
                                                    for (String letra10 : lista){
                                                        palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6 + letra7 + letra8 + letra9 + letra10;
                                                        if (palavra_teste.contains(central)){
                                                               if (palavraEstaNoDicionario(palavra_teste)) {
                                                                    set_teste.add(palavra_teste);
                                                               }
                                                        }                                                        
                                                    }                                      
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }
            

            
            if (cont == 11){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        for (String letra7: lista){
                                            for (String letra8 : lista){
                                                for (String letra9 : lista){
                                                    for (String letra10 : lista){
                                                       for (String letra11 : lista){
                                                            palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6 + letra7 + letra8 + letra9 + letra10 + letra11;
                                                            if (palavra_teste.contains(central)){
                                                                   if (palavraEstaNoDicionario(palavra_teste)) {
                                                                        set_teste.add(palavra_teste);
                                                                   }
                                                            }  
                                                       }
                                                    }                                      
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();                
            }
            
            

            
            if (cont == 12){
                for (String letra1 : lista){
                    for (String letra2 : lista){
                        for (String letra3 : lista){
                            for (String letra4 : lista){
                                for (String letra5 : lista){
                                    for (String letra6 : lista){
                                        for (String letra7: lista){
                                            for (String letra8 : lista){
                                                for (String letra9 : lista){
                                                    for (String letra10 : lista){
                                                       for (String letra11 : lista){
                                                           for (String letra12 : lista){
                                                                palavra_teste = letra1 + letra2 + letra3 + letra4+ letra5 + letra6 + letra7 + letra8 + letra9 + letra10 + letra11 + letra12;
                                                                if (palavra_teste.contains(central)){
                                                                       if (palavraEstaNoDicionario(palavra_teste)) {
                                                                            set_teste.add(palavra_teste);
                                                                       }
                                                                }
                                                           }
  
                                                       }
                                                    }                                      
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println("\nPalavras com "+ cont +" letras:");
            System.out.println(set_teste);
            total = total + set_teste.size();
            set_teste.clear();  
            }
            
            
         
        cont++;

          
            
        }
        

        System.out.println("\nForam encontradas "+ total +" palavras.");  
        
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Forneça as 6 letras da periferia separadas por espaço: ");
        String entrada = scanner.nextLine();
        String[] letrasEntrada = entrada.split(" ");
        if (letrasEntrada.length < 6){
            System.out.println("Você forneceu apenas " + letrasEntrada.length + " letras.");
            System.out.println("O programa será encerrado.");
            System.exit(0);
        } else if (letrasEntrada.length > 6){
            System.out.println("Você forneceu " + letrasEntrada.length + " letras.");
            System.out.println("O programa será encerrado.");
            System.exit(0);
        } else {
           List<String> letras = new ArrayList<>(Arrays.asList(letrasEntrada));
           System.out.println("Forneça a letra central: ");
           String central = scanner.nextLine();
           letras.add(central);
           //System.out.println(letras);
           formarPalavras(letras);
           
           //System.out.println("Foram encontradas " + palavrasTestar.size() + " palavras.");
          // System.out.println("As palavras são: ");
          // System.out.println(palavrasTestar);
          
          // Set<String> palavrasFinal = new TreeSet<>();
        
          /* try {
                VerificadorDePalavras.carregarDicionario(); // Carrega o dicionário do arquivo
                for (String palavraTeste : palavrasTestar){
                    if (palavraEstaNoDicionario(palavraTeste)) {
                        palavrasFinal.add(palavraTeste);
                    }
                }

           } catch (IOException e) {
                System.err.println("Erro ao carregar o dicionário: " + e.getMessage());
           }
           
            System.out.println("Foram encontradas " + palavrasFinal.size() + " palavras.");
            System.out.println("As palavras são: ");
            System.out.println(palavrasFinal);*/
       
        }
    }
    
}
    
