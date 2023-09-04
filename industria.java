import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scan1 = new Scanner(System.in);
Scanner scan2 = new Scanner(System.in);
Scanner scan3 = new Scanner(System.in);

System.out.println("Informe a matricula do funcionario: ");
int matricula = scan1.nextInt();
System.out.println("Informe o nome do funcionario: ");
String nome = scan2.nextLine();
System.out.println("Informe o salario do funcionario: ");
int salario = scan3.nextInt();

    double inss = salario * 0.15;
    double deducao = salario - inss;

    System.out.print("A matricula do funcionario é: "+ matricula);
    System.out.print("O nome do funcionario é: "+ nome);
    System.out.print("O salario bruto é : "+ salario);
    System.out.print("A dedução é : "+ deducao);
    System.out.print("O salario liquido é : "+ inss);

    }
}
