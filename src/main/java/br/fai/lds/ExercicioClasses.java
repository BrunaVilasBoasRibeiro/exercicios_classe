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
 

}
