package com.crud.RedeSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.RedeSocial.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {	
	public List<Postagem> findAllByDescricaoContainingIgnoreCase (String descricao);

}
