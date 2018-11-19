package com.cg.starter;

import com.cg.starter.controller.Controller;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class JenkinsSpringBootTestApplicationTests {


	@Autowired
	private Controller controller;
	private MockMvc mockMvc;

	/**
	 * Before run any test setup
	 */
	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	/**
	 * Integration testing of helloworld method of controller
	 *
	 * @throws Exception
	 */
	@Test
	public void helloWorldTest() throws Exception {
		String response = mockMvc.perform(MockMvcRequestBuilders
				.get("/")
				.accept(MediaType.APPLICATION_JSON))
				.andReturn()
				.getResponse()
				.getContentAsString();
		Assert.assertThat("Hello World!", Is.is(response));
	}


}
