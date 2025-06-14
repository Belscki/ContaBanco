import java.util.Scanner;

public class ContaTerminal {
    /*
     * ContaTerminal.java
     * Variaveis:
     * numero - Integer
     * agencia - String
     * nomeCliente - String
     * saldo - Float
     * Fluxo
     * -> Cadastrar || Acessar || Depositar
     * -> Dados Cliente
     * -> Retorno das Informações E %saldo%
     * 
     * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
     * .
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("\nMetodo:\n");
            System.out.printf("1-Consultar:\n");
            System.out.printf("2-Cadastrar:\n");
            System.out.printf("3-Depositar:\n");
            System.out.printf("4-Sair:\n");
            int metodo = scanner.nextInt();

            switch (metodo) {
                case 1 -> {
                    System.out.println("Insira as informações para consulta:");

                    System.out.println("Numero da Conta:");
                    int number_user = scanner.nextInt();

                    if (!(number_user == User.number_user)) {
                        System.out.printf("Informação Erronea: %s", number_user);
                        return;
                    }

                    System.out.println("Numero da Agencia:");
                    String agency = scanner.next();
                    scanner.nextLine();

                    if (!(agency.equalsIgnoreCase(User.agency))) {
                        System.out.printf("Informação Erronea: %s", agency);
                        return;
                    }

                    System.out.println("Nome completo:");
                    String user_name = scanner.nextLine();

                    if (!(user_name.equalsIgnoreCase(User.user_name))) {
                        System.out.printf("Informação Erronea: %s != %s", user_name, User.user_name);
                        return;
                    }

                    System.out.printf("Olá %s, Saldo: %s", user_name, User.getMoney());
                    ContaTerminal.main(args);
                }
                case 2 -> User.cadastrar(args);
                case 3 -> {
                    System.out.println("Insira as informações para Deposito:");

                    System.out.println("Numero da Conta:");
                    int number_user = scanner.nextInt();

                    if (!(number_user == User.number_user)) {
                        System.out.printf("Informação Erronea: %s", number_user);
                        return;
                    }

                    System.out.println("Numero da Agencia:");
                    String agency = scanner.next();
                    scanner.nextLine();

                    if (!(agency.equalsIgnoreCase(User.agency))) {
                        System.out.printf("Informação Erronea: %s", agency);
                        return;
                    }

                    System.out.println("Nome completo:");
                    String user_name = scanner.nextLine();

                    if (!(user_name.equalsIgnoreCase(User.user_name))) {
                        System.out.printf("Informação Erronea: %s != %s", user_name, User.user_name);
                        return;
                    }
                    User.depositar();
                }
                case 4 -> {
                    break;
                }
                default -> throw new AssertionError();
            }
        }
    }
}