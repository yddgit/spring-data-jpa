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
import com.my.project.entity.User;
import com.my.project.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { SpringDataJpaApplication.class, AppConfig.class })
@WebAppConfiguration
public class UserRepositoryTest {

	@Autowired
	UserRepository repository;

	@Test
	public void sampleTestCase() {
		User dave = new User("Dave", "Matthews");
		dave = repository.save(dave);

		User carter = new User("Carter", "Beauford");
		carter = repository.save(carter);

		List<User> result = repository.findByLastname("Matthews");
		assertThat(result.size(), is(1));
		assertThat(result, hasItem(dave));
	}

}