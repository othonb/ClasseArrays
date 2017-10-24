package arraymanipulations;

import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {
        // Classifica vetorOrdenado em ordem crescente
        double [] vetorOrdenado = {8.4, 9.3, 0.2, 7.9, 3.4};
        
        // Ordena o vetorOrdenado
        Arrays.sort (vetorOrdenado);
        
        // Imprime uma mensagem amigável
        System.out.print ("Vetor Ordenado = {");
        
        // Laço para a exibição dos valores do vetor
        for (double elemento : vetorOrdenado) {
            
            System.out.print (elemento + "\t");
        }
        
        // Fecha a mensagem amigável
        System.out.println ("}");
        
        // Preenche um vetor com 10 elementos com o valor 7
        int [] vetorPreenchido = new int [10];
        
        Arrays.fill (vetorPreenchido, 7);
        
        // Exibe os elementos do vetor preenchido
        System.out.print ("Vetor Preenchido = {");
        
        for (int elemento : vetorPreenchido) {
            
            System.out.print (elemento + "\t");
        }
        
        System.out.println ("}");
        
        // Copia os valores de um vetor em outro
        int [] vetorFonte = {1, 3, 5, 7, 9, 11};
        
        int [] vetorDestino = new int [vetorFonte.length];
        
        System.arraycopy(vetorFonte, 0, vetorDestino, 0, vetorFonte.length);
        
        exibeVetor (vetorFonte, "Vetor Fonte");
        exibeVetor (vetorDestino, "Vetor Destino");
        
        // Compara a igualdade dos vetorFonte e vetorDestino
        boolean teste = Arrays.equals(vetorFonte, vetorDestino);
        
        System.out.printf ("\n\n vetorFonte %s vetorDestino\n", teste ? "==" : "!=");
        
        // Compara a igualdade dos vetorFonte e vetorPreenchido
        teste = Arrays.equals(vetorFonte, vetorPreenchido);
        
        System.out.printf ("\n\n vetorFonte %s vetorPreenchido\n\n", teste ? "==" : "!=");
        
        // Pesquisa o valor 3.4 em vetorOrdenado
        int posicao = Arrays.binarySearch(vetorOrdenado, 3.4);
        
        if (posicao > 0) 
            System.out.printf ("O valor 3.4 foi encontrado na posição %d\n", posicao);
        else
            System.out.printf ("O valor 3.4 NÃO foi encontrado!!!\n");
        
        
        // Pesquisa o valor 32 em vetorFonte
        posicao = Arrays.binarySearch(vetorFonte, 32);
        
        if (posicao > 0) 
            System.out.printf ("O valor 32 foi encontrado na posição %d\n", posicao);
        else
            System.out.printf ("O valor 32 NÃO foi encontrado!!!\n");
        
        
        
    }
    
    private static void exibeVetor (int [] vetor, String msg) {
        
        System.out.printf ("\n%s", msg);
        
        for (int valor : vetor) 
            System.out.printf ("%d", valor);
        
        System.out.println ();
    }
    
}
