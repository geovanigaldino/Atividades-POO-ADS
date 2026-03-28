//public class Principal {
//    public static void main(String[] args) {
//        Pessoa criminoso = new Pessoa("Carlos Silva", "111.111.111-11", "Criminoso");
//        Pessoa vitima1 = new Pessoa("Maria Souza", "222.222.222-22", "Vítima");
//        Pessoa vitima2 = new Pessoa("João Lima", "333.333.333-33", "Vítima");
//
//        Arma arma1 = new Arma(101, "Faca", "Faca de cozinha apreendida");
//        Arma arma2 = new Arma(102, "Revólver", "Revólver calibre 38 apreendido");
//
//        Crime crime1 = new Crime(1, "Roubo com agressão", "Centro", criminoso, vitima1, arma1);
//        Crime crime2 = new Crime(2, "Ameaça armada", "Bairro Novo", criminoso, vitima2, arma2);
//
//        // Relacionamento 1:N
//        // 1 pessoa (criminoso) -> muitos crimes
//        criminoso.adicionarCrime(crime1);
//        criminoso.adicionarCrime(crime2);
//
//        System.out.println("=== DADOS DO CRIMINOSO ===");
//        criminoso.exibirDados();
//
//        System.out.println("\n=== CRIMES DO CRIMINOSO ===");
//        criminoso.exibirCrimes();
//
//        System.out.println("\n=== DETALHES DOS CRIMES ===");
//        crime1.exibirDados();
//        System.out.println();
//        crime2.exibirDados();
//    }
//}