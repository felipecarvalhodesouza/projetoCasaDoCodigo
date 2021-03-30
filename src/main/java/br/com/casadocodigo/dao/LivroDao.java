package br.com.casadocodigo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.modelo.Livro;

public class LivroDao {

    @PersistenceContext
    private EntityManager manager;

    public void salvar(Livro livro) {
        manager.persist(livro);
    }

}
