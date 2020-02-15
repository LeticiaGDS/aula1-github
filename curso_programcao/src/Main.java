
import entities.Quartos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos funcionarios serão registrados?");
        int n = sc.nextInt();
        List<Quarto> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Empregado #" + i);
            System.out.println("Id: ");
            int id = sc.nextInt(); 
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double s = sc.nextDouble();
            int nq = sc.nextInt();
            list.add(new Quarto(id, nome, s));
        }
        
       System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Quarto emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Quarto obj : list) {
			System.out.println(obj);
		}
        
        sc.close();
    }
}
   

