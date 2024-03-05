package com.agenda.dao;

import java.sql.SQLException;

import com.agenda.model.Contato;

public class ContatoDao extends GenericDao {

	
	public void salvar (Contato Contato) throws SQLException {
		String insert = "INSERT INTO CONTATOS(nome, apelido, data_nascimento) VALUES(?,?,?)";
		save(insert, Contato.getName(), Contato.getApelido(), Contato.getDtNascimento());
	}
	
	
	public void alterar(Contato contato) throws SQLException {
		String update = "UPDATE CONTATOS " +
                "SET nome = ?, apelido = ?, data_nascimento = ? " +
                "WHERE id = ?";
		update(update, contato.getId(),contato.getName(),
				contato.getApelido(),contato.getDtNascimento());
	}
	
	
	public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM CONTATOS WHERE id = ?";
        delete(delete, id);
    }
	
	
	
	
	
	
}
