import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AmigoSecreto {

    private List<String> participantes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AmigoSecreto app = new AmigoSecreto();
        app.menu();
    }

    private void menu() {
        while (true) {
            System.out.println("\n--- Amigo Secreto ---");
            System.out.println("1. Adicionar participante");
            System.out.println("2. Listar participantes");
            System.out.println("3. Sortear");
            System.out.println("4. Limpar lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": adicionarParticipante(); break;
                case "2": listarParticipantes(); break;
                case "3": sortear(); break;
                case "4": limparLista(); break;
                case "0": System.out.println("Encerrando..."); return;
                default: System.out.println("Opcao invalida!");
            }
        }
    }

    private void adicionarParticipante() {
        System.out.print("Digite o nome do participante: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Nome vazio! Tente novamente.");
            return;
        }
        participantes.add(nome);
        System.out.println("Participante '" + nome + "' adicionado.");
    }

    private void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Nenhum participante cadastrado.");
            return;
        }
        System.out.println("Participantes:");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println((i + 1) + ". " + participantes.get(i));
        }
    }

    private void limparLista() {
        participantes.clear();
        System.out.println("Lista limpa!");
    }

    private void sortear() {
        int n = participantes.size();
        if (n < 2) {
            System.out.println("E necessario pelo menos 2 participantes.");
            return;
        }

        List<String> receivers = new ArrayList<>(participantes);
        boolean valido;
        do {
            Collections.shuffle(receivers);
            valido = true;
            for (int i = 0; i < n; i++) {
                if (participantes.get(i).equals(receivers.get(i))) {
                    valido = false;
                    break;
                }
            }
        } while (!valido);

        System.out.println("\n--- Resultado do Sorteio ---");
        for (int i = 0; i < n; i++) {
            System.out.println(participantes.get(i) + " -> " + receivers.get(i));
        }
    }
}
cd challenge-amigo-secreto/java-console
javac AmigoSecreto.java
java AmigoSecreto
