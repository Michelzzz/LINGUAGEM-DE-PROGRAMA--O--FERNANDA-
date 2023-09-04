package calculadora;
public class Calculadora {

    int tipo;
    int n1, n2;
    int soma(int n1, int n2){
        int soma1 = n1 + n2;
        return soma1;
    }

    int subtracao(int n1, int n2){
        int sub1 = n1 - n2;
        return sub1;
    }

    int mutiplicao(int n1, int n2){
        int mut1 = n1 * n2;
        return mut1;

    }

    int divisao(int n1, int n2){
        int div1 = n1 / n2;
        return div1;

    }


}