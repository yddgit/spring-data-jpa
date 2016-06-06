package com.my.project.repository;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.my.project.SpringDataJpaApplication;
import com.my.project.config.AppConfig;
import com.my.project.entity.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { SpringDataJpaApplication.class, AppConfig.class })
@WebAppConfiguration
public class BookRepositoryTest {

	@Autowired
	BookRepository repository;

	@Test
	public void sampleTestCase() {
		Book java = new Book("Thinking in Java", "Tom");
		java = repository.save(java);

		Book cpp = new Book("C++ Trap", "Jack");
		cpp = repository.save(cpp);

		List<Book> result = repository.findByName("C++ Trap");
		assertThat(result.size(), is(1));
		assertThat(result, hasItem(cpp));
	}

}