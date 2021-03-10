package Biblioteca;

import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        Cliente cl = new Cliente();
        
        System.out.println("Digite seu nome:");
        cl.nome = ler.nextLine();
        
        System.out.println("Digite sua idade:");
        cl.idade = ler.nextInt();
        
        System.out.println("Digite sua preferência de livro:");
        cl.setPreferencia(ler.nextLine());
        
        System.out.println("************************************");
        System.out.println("Verificando...");
        System.out.println("************************************");
        
        System.out.println(cl);
        System.out.println("Verifiquei os dados e percebi que você... " + cl.verificarIdade());
        
        
        
        Livro l1 = new Livro();
        
        System.out.println("Digite o Titulo do Livro:");
        l1.titulo = ler.nextLine();
        
        System.out.println("Digite o Autor:");
        l1.autor = ler.nextLine();
        
        System.out.println("Digite o ano do livro:");
        l1.ano = ler.nextInt();
        
        System.out.println("Digite o genero do livro:");
        l1.setGenero(ler.nextLine());
        
        System.out.println("Digite o preço do livro:");
        l1.setPreco(ler.nextDouble());
        
        System.out.println("***********************************");
        System.out.println("Verificando no Sistema...");
        System.out.println("***********************************");
        
        System.out.println(l1);
        System.out.println("Pelo que analisei... " + l1.verificarPreco());
        
        System.out.println(l1);
        System.out.println("O valor da compra com o desconto é de..." + l1.verificarPreco2());
    }
}
