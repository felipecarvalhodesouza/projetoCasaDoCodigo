package br.com.casadocodigo.loja.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.casadocodigo.dao.LivroDao;
import br.com.casadocodigo.loja.modelo.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

    private Livro livro = new Livro();
    
    @Inject
    private LivroDao dao;

    @Transactional
    public void salvar() {
    	dao.salvar(livro);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}