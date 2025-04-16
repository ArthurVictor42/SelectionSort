public class SelectionSorf {
    
    // Metodo para descobrir o menor valor do vetor
    public static int menorValor(int[] vetor, int atual){
        int menor = atual;
        for(int i = atual; i < vetor.length; i++){
            if(vetor[menor] > vetor[i]){
                menor = i;
            } 
        }
        return menor;
    }
    public static void main(String[] args) {
        
        int[] vetor = {4, 2, 6, 75, 12, 42, 1, 1, 2, 0};

        // Exibir a parte não ordenada
        System.out.println("Sem ordenação: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
            if(i < vetor.length - 1){
                System.out.print(", ");
            }
        }
        
        // For para fazer a ordenação utilizando o menor valor
        System.out.println("\nCom ordenação");
        for(int i = 0; i < vetor.length - 1; i++){
            int menor = menorValor(vetor, i);
            int atual = vetor[i];
            int menorArray = vetor[menor];
            vetor[i] = menorArray;
            vetor[menor] = atual;
        }

        //Exibe a parte ordenada
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
    
    }
}