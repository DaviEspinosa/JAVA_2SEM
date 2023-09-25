package ArrayList;

public class ExArrayList {
    // Atributo
    int cont;

    // criar vetor1 com tamanho cont
    // criar vetor2 com tamanho cont++

    int vetor1[] = new int[cont];
    int vetor2[] = new int[cont++];

    // metodo
    // este metodo cria um novo vetor com mais uma posição, e irá copiar o vetor
    // anterior, sempre que mencionado
    public void add (int add) {    

        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i];
        }
        //adicionei o valor do add a ultima posição do vetor2
        vetor2[vetor2.length-1] = add;
        //copiar o vetor2 para o vetor1
        //redefinir o tamanho do vetor1
        int vetor1 [] = new int [cont++];
        //copiar vetor2 para vetor1
        for (int i = 0; i < vetor2.length; i++) {
            vetor1[i] = vetor2[i];

        }
        cont++;
    }
    public void imprimir(){
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
            System.out.println(vetor2[i]);
        }
    }
}
