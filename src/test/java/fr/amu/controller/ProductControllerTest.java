//package fr.amu.controller;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//import fr.amu.controllers.ProductController;
//import fr.amu.services.ProductService;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(ProductController.class)
//public class ProductControllerTest{
//	
//	
//	@Autowired
//	private ProductController pController;
//	
//	@Autowired
//	MockMvc mvc;
//	
//	@MockBean
//	ProductService pService;
//	
//	//avant chaque test
//	@Before
//	public void setup() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setPrefix("WEB-INF/jsp");
//		viewResolver.setSuffix(".jsp");
//		
//		mvc = standaloneSetup(pController).setViewResolvers(viewResolver).build();
//	}
//	
//	@Test
//	public void contextLoads() throws Exception{
//		assertThat(pController).isNotNull();
//	}
//	
//	/*@Test
//	public void add() throws Exception {
//	mvc.perform(post("/add").contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//			.param("title", "title1")
//			.param("description", "description2")
//			.param("category", "category3"))
//			.andExpect(view().name("homepage"));
//	}*/
//	
//}
