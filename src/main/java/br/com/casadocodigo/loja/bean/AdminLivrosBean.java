package br.com.casadocodigo.loja.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.loja.modelo.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

    private Livro livro = new Livro();

    public void salvar() {
        System.out.println("Livro cadastrado: " + livro);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}