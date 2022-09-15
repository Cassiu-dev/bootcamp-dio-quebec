package MetodosJavaDIO;

import java.util.Scanner;

public class Operacoes {




    public void calcular(int num1, int num2){
        int soma;
        int sub;
        int mult;
        int div;

        soma = num1 + num2;
        sub = num1-num2;
        mult = num1*num2;
        div = num1/num2;

        System.out.println("Soma : "+ soma+" sub: "+ sub+" mult: "+ mult + " div:"+div);


    }

    public void hora(int hora, int minuto){
        if (0 <= hora && hora <= 23){
            if (6 <= hora && hora <= 12){
                System.out.println("Bom dia");
            }else if (13 <= hora && hora <= 18) {
                System.out.println("Boa Tarde");
            }else {
                System.out.println("Boa Noite");
            }
        }else{
            System.out.println("Essa hora não é valida");
        }
    }

    public void emprestimo(double valorSolicitado, int parcelas){

        double valorFinal;
        valorFinal = valorSolicitado * (parcelas*0.12);
        System.out.println(valorFinal);

    }

}
