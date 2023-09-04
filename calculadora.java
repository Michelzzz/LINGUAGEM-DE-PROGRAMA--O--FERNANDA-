Calculadora c = new Calculadora();
int tipo;

System.out.println("Informe o ");

System.out.println("Informe o primeiro numeros: ");
    Scanner scan1 = new Scanner(System.in);
    int n1 =  scan1.nextInt();
    c.n1 = n1;

System.out.println("Informe o segundo numeros: ");
    Scanner scan2 = new Scanner(System.in);
    int n2 =  scan2.nextInt();
    c.n2 = n2;


        if (tipo == 1) {
            c.soma(n1, n2);

        }
   