package com.my.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.project.entity.Book;
import com.my.project.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@RequestMapping("/books")
	public @ResponseBody List<Book> test() {
		return bookRepository.findAll();
	}

	@RequestMapping("/book/{id}")
	public @ResponseBody Book findById(@PathVariable("id") Book book) {
		return book;
	}
}
