package fr.amu.controller;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.*;
import org.junit.*;
import fr.amu.controllers.*;
import org.springframework.boot.web.server.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.*;;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private IndexController icontroller;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void contexLoads() throws Exception {
	assertThat(icontroller).isNotNull(); // on vérifie que le controller est bien lancé
	}
	
	@Test
	public void index() {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
			String.class)).contains("homepage");
	}
	 // cette approche est limitée et n'est pas
	
}
