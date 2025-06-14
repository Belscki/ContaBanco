
import java.util.Scanner;

public class User {
    public static int number_user;
    public static String agency;
    public static String user_name;
    private static float money;

    public static float getMoney() {
        return money;
    };

    public static void cadastrar(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Novo Cadastro ?");
            System.out.println("Insira seu nome:");
            user_name = scanner.nextLine();
            number_user = (int) (Math.random() * 1000);

            int agency_number = (int) (Math.random() * 100);
            int agency_location = (int) (Math.random() * 10);
            agency = String.format("%03d-%d", agency_number, agency_location);

            System.out.printf("Registro feito, informações para consulta:\n Numero da Conta: %s \n Agencia: %s\n Nome Completo: %s\n", number_user, agency, user_name);
            ContaTerminal.main(new String[0]);
        } catch (Exception e) {
        }
    }

    public static void depositar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quanto deseja depositar?");
            float valor_deposito = scanner.nextFloat();

            money = money + valor_deposito;
            System.out.printf("Novo saldo: %s", money);
            ContaTerminal.main(new String[0]);
        }catch (Exception e){
        }
    }

}
