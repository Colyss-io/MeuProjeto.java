public class IfeElse {
    public static void main(String[] args) {

        // Declarando a idade
        int idade = 15;
        boolean amigoDoDono = true;
        // Criando a condição para a idade
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Você não pode entrar nesse local");
        } else {
            System.out.println("Você pode entrar nesse local");
        }
    }
}
