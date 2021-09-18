// 1 - Pacote
package intro;

// 2- Referência Bibliotecas
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

// 3- Classe
public class Medidas {
    // 3.1 Atributos

    //3.2 Métodos e Funções
    public static void main(String[] arg) {
        System.out.println("Cálculo de Areas!!!");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println();
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + " m²");

    }
    public void calcularAreaModoExtenso(){
    //Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;  // Largura recebe 4
        comprimento = 3;
        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + " m²");

    }
    public void calcularAreaModoCompacto(){
        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println();
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + " m²");

    }

}
