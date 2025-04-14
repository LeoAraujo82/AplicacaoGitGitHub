import java.util.*;

public class Op01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> produtos = new ArrayList<>();
        int id = 1;

        while (true) {
            System.out.println("\n1-Cad 2-List 3-Alt 4-Del 0-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                String preco = sc.nextLine();
                System.out.print("Qtd: ");
                String qtd = sc.nextLine();
                produtos.add(new String[]{String.valueOf(id++), nome, preco, qtd});
            }
        }
    }
}



