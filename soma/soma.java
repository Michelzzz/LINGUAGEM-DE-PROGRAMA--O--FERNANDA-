package soma;
Soma s = new Soma();
System.out.println("Infome o nome do aluno: ");
    Scanner scan1 = new Scanner(System.in);
    String nome = scan1.nextLine();
    s.nome = nome;

System.out.println("Coloque a primeira nota do aluno: ");
    Scanner scan2 = new Scanner(System.in);
    int n1 = scan2.nextInt();
    s.n1 = n1;

System.out.println("Coloque a segunda nota do aluno: ");
    Scanner scan3 = new Scanner(System.in);
    int n2 = scan3.nextInt();
    s.n2 = n2;

int resultado = s.media(n1, n2);
    System.out.println("O nome do aluno é: "+ s.nome+ "e a media do aluno é: "+ resultado);

