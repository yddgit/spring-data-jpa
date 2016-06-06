package com.my.project.repository;

import java.util.List;

import com.my.project.entity.Book;

public interface BookRepository extends BaseRepository<Book, Long> {
	Long countByAuthor(String author);
	Long deleteByName(String name);
	List<Book> removeByName(String name);
	List<Book> findByName(String name);
}
