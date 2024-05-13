package LogicaDeProgramacaoEmJava;
/*
 * Dado um determinado salario
 * Se o salario for maior que 4500 imprima 30% do valor
 * Se imprima 15% do valor
 * desafio: utile apenas uma variavel para guarda o resultado e imprimir no final
 * desafio2: diga na impresao se e 30% ou 10%
 */

public class ControleDefluxoFiElse03 {
    public static void main(String[] args) {
        /*
             Meu codigo que eu mesmo fiz como  Exercicio(sem o desafio):
        double salario = 4200.50;
        double porcentagem = 0.30;
        double porceta = 0.15;
        double result = salario * porceta;
        double resultado = salario * porcentagem;


        if(salario > 4500 ){
            System.out.println("a porcentagem foi de 0.30% " + resultado);
        }else {
            System.out.println("a porcentagem foi de 15% " + result );
        }
    }
    */
        //Meu codigo que eu mesmo fiz como  Exercicio(com  o desafio fiz certo):
        float salario = 4200.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500) {
             resultado = salario * 0.30F;
             porcentagem = "30%";


        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("o valor final em porcentagem de: " +porcentagem + " e de " +resultado);



        /*
             Eu copiei esse código do video (sem o desafio)
        float salario = 4200.50F;
        if (salario > 4500) {
            float trintaporcento = salario * 0.30F;
            System.out.println("30% =" + trintaporcento);
        } else {
            float dezporcento = salario * 0.15F;
            System.out.println("15% = " + dezporcento);
        }
        */


    }
}

