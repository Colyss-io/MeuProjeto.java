public class Exercício1 {
    public static void main(String[] args) {
        //janeiro = 15.000
        //fevereiro = 23.000
        //março = 17.000

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarço = 17000;
        String mediaMensal = "Esses são os gastos mensais ";

        int gastosSomados = gastosJaneiro + gastosFevereiro + gastosMarço;
        System.out.println(mediaMensal + gastosSomados);
    }
}
