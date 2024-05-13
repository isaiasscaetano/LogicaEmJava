package LogicaDeProgramacaoEmJava;
/*
 * Receba uma idade como entrada
 * se a idade for maior que 18 imprima "Adulto"
 * senao imprima "Ainda nao e adulto"*/

public class ControleDeFluxoFiElse02 {
    public static void main(String[] args) {
        int idade = 18;
        if (idade >= 18) {
            System.out.println("1adulto1");
        } else {
            System.out.println("1Ainda nao e adulto1");
        }
        if (idade > 18) {
            System.out.println("2adulto2");
        } else {
            System.out.println("2Ainda nao e adulto2");
        }
        if (idade <= 18) {
            System.out.println("3Ainda nao e adulto3");
        } else {
            System.out.println("3Adulto3");
        }
        if (idade < 18) {
            System.out.println("4Ainda nao e adulto4");
        } else {
            System.out.println("4dulto4");
        }
        if (idade == 18) {
            System.out.println("5Adulto5");
        } else {
            System.out.println("5Ainda nao e adulto5");
        }
        if (idade != 18) {
            System.out.println("6Ainda nao e adulto6");
        } else {
            System.out.println("6Adulto6");
        }
    }
}

