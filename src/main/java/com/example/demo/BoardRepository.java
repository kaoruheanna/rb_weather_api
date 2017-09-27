package com.example.demo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>{
	Collection<Board> findByTemp(int temp);
}


