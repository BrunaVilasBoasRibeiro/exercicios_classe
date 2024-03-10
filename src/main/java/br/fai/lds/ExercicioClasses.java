package br.fai.lds;

import br.fai.lds.models.Animal;
import br.fai.lds.models.Cavalo;
import br.fai.lds.models.Girafa;

import java.util.*;

public class ExercicioClasses {

    public static void main(String[] args) {
        ExercicioClasses app = new ExercicioClasses();
        app.start();
    }
    List<Animal> animais = new ArrayList<>();
    private void start() {
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("                     Menu:                      ");
            System.out.println("------------------------------------------------");
            System.out.println("1. Cadastrar Cavalo                             ");
            System.out.println("2. Cadastrar Girafa                             ");
            System.out.println("3. Listar Cavalos                               ");
            System.out.println("4. Listar Girafas                               ");
            System.out.println("5. Listar todos os animais                      ");
            System.out.println("6. Remover um animal por id                     ");
            System.out.println("7. Exibir a qtde de animais cadastrados por tipo");
            System.out.println("8. Sair                                         ");
            System.out.println("Escolha  uma opção:                             ");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    cadastrarCavalo();
                    break;
                case 2:
                    cadastrarGirafa();
                    break;
                case 3:
                    listarCavalo();
                    break;
                case 4:
                    listarGirafa();
                    break;
                case 5:
                    listarTodosAnimais();
                    break;
                case 6:
                    removerAnimalPorId();
                    break;
                case 7:
                    listarQtdeAnimaisPorTipo();
                    break;
                case 8:
                    System.out.println("Finalizando.......");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (op !=8);

        System.out.println("Finalizou");
    }
    private void cadastrarCavalo() {
        System.out.println("Digite o nome do Cavalo: ");
        Scanner scanner = new Scanner(System.in);
        String nomeCavalo = scanner.nextLine();
        Cavalo cavalo = new Cavalo(nomeCavalo);
        animais.add(cavalo);
        System.out.println("O cavalo foi inserido com sucesso");
    }
    private void cadastrarGirafa() {
        System.out.println("Digite o nome da Girafa: ");
        Scanner scanner = new Scanner(System.in);
        String nomeGirafa = scanner.nextLine();
        Girafa girafa = new Girafa(nomeGirafa);
        animais.add(girafa);
        System.out.println("A girafa foi inserida com sucesso");

    }

    private void listarCavalo() {
        System.out.println("------------------------------------------------");
        for (Animal animal : animais) {
            if (animal instanceof Cavalo){
                Cavalo cavalo = (Cavalo)animal;
                System.out.println("Dados do cavalo: ID: " + cavalo.getId() + " | Nome: " + cavalo.getNome());
            }
        }
    }
    private void listarGirafa() {
        System.out.println("------------------------------------------------");
        for (Animal animal : animais){
            if (animal instanceof Girafa){
                Girafa girafa = (Girafa)animal;
                System.out.println("Dados da girafa: ID: " + girafa.getId() + " | Nome: " + girafa.getNome());
            }

        }
    }
    private void listarTodosAnimais() {
        System.out.println("------------------------------------------------");
        System.out.println("           Exibindo todos os animais            ");
        if (animais.size() ==0){
            System.out.println("       Não existe animais cadastrado!       ");
        }
        // Criar Mapa de animais, sendo a chave o tipo do animal CAVALO ou GIRAFA
        Map<String, List<Animal>> mapaAnimais = new HashMap<>();

        // Chave criada para interar no mapa
        String chaveCavalo = "CAVALO";
        String chaveGirafa = "GIRAFA";

        //Lista de animais com suas chaves
        mapaAnimais.put(chaveCavalo, new ArrayList<>());
        mapaAnimais.put(chaveGirafa, new ArrayList<>());

        // separandos os animais em suas respectivas chaves
        for (Animal animal: animais) {
            if (animal instanceof Cavalo) {
                List<Animal> cavalos = mapaAnimais.get(chaveCavalo);
                cavalos.add(animal);
            } else if (animal instanceof Girafa) {
                List<Animal> girafas = mapaAnimais.get(chaveGirafa);
                girafas.add(animal);
            }
        }
        System.out.println("------------------------------------------------");
        List<Animal> cavalos = mapaAnimais.get(chaveCavalo);
        System.out.println("Num de Cavalos Cadastrados: " + cavalos.size());
        for (Animal animal: cavalos) {
            System.out.println("Dados do animal: | Tipo do Animal: " + chaveCavalo +"| ID: " + animal.getId() + " | Nome do cavalo: " + animal.getNome());
        }
        System.out.println("------------------------------------------------");
        List<Animal> girafas = mapaAnimais.get(chaveGirafa);
        System.out.println("Num de Cavalos Cadastrados: " + girafas.size());
        for (Animal animal: girafas) {
            System.out.println("Dados do animal: | Tipo do Animal: " + chaveGirafa +"| ID: " + animal.getId() + " | Nome do cavalo: " + animal.getNome());
        }

        System.out.println("Total de animais cadastrados: " + (cavalos.size() + girafas.size()));
        System.out.println("------------------------------------------------");
    }
    


}
