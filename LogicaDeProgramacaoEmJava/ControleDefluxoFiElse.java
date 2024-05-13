package LogicaDeProgramacaoEmJava;

public class ControleDefluxoFiElse {
    public static void main(String[] args) {
        if (true) {
            System.out.println("1dentro do if1 ");
        }else{
            System.out.println("1dentro do else1");
        }
        System.out.println("1fora do if1 e else1");

        if (false) {
            System.out.println("2DENTRO DO IF2");
        }else{
            System.out.println("2DENTRO DO ELSE2");
        }
        System.out.println("2FORA DO IF2 DO ELSE2 ");

        boolean condiçao = false;
        if (condiçao) {
            System.out.println("3dentro do if3");
        }else {
            System.out.println("3dentro do else3");
        }
        System.out.println("3fora do if3 do else3");

        boolean condicao = true;
        if (condicao) {
            System.out.println("4DENTRO DO IF4 ");
        }else{
            System.out.println("4DENTRO DO ELSE4");
        }
        System.out.println("4FORA DO IF4 DO ELSE4 ");
    }
}

