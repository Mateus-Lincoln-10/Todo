import java.util.Scanner;
import java.util.ArrayList;

public class ToDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        int option, remove, cont;
        
        System.out.println("\nDeseja adicionar uma tarefa? Aperte ENTER");
        do {
            input.nextLine();
            System.out.println("\nDigite uma tarefa: ");
            tasks.add(input.nextLine());
            
            System.out.println("\n[1] Adicionar outra tarefa , [2] Não quero adicionar outra tarefa");
            System.out.println("\nDigite somente o número da opção");  
            option = input.nextInt();
        } while(option == 1);
        
        do {
            System.out.println("\n[1] Remover tarefa, [2] Encerrar");
            System.out.println("\nDigite somente o número da opção");  
            remove = input.nextInt();
            
            if (remove == 1) {
                input.nextLine();
                System.out.println("\nDigite o nome da tarefa que deseja remover: ");
                tasks.remove(input.nextLine());
            } else {
                System.out.println("\nSuas tarefas");
                    for (cont = 0; cont < tasks.size(); cont++) {
                        System.out.println("\nTarefa "+cont+": "+tasks.get(cont));
                    }
                break;
            }  
        } while(remove == 1);     
    }
}
