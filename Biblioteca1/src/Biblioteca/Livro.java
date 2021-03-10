
package Biblioteca;

public class Livro {
    public String titulo, autor;
    public int ano;
    private String genero;
    private double preco;

    public Livro(String titulo, String autor, int ano, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.preco = preco;
    }
    
    public Livro() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String verificarPreco() {
        String resposta;
        if (preco >= 100) {
            resposta = "Esse livro terá desconto!";
        }else {
            resposta = "Esse livro não terá desconto!";
        }
        return resposta;
    }
    
    public double verificarPreco2() {
        if (this.preco >= 100) {
             preco = (preco - (preco * 0.2));
        }else{
            preco = preco;
        }
        return preco;
    }
    
    @Override
    public String toString() {
        return "Dados do Livro" + "\n"
                + "O titulo do livro é:" + this.titulo + "\n"
                + "O autor do livro é:" + this.autor + "\n"
                + "O ano do livro é:" + this.ano + "\n"
                + "O genêro do livro é:" + this.genero + "\n"
                + "O preço do livro é:" + this.preco;
    }
    
    
}
