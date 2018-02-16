package glue.controllers;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import glue.entities.DockerConfiguration;
import glue.entities.TelegrafConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TelegrafConfigControllerTest {
	/** The logger. */
	private final Logger LOGGER = LoggerFactory.getLogger(TelegrafConfigControllerTest.class);
	/** The rest template. */
	@Autowired
	private TestRestTemplate restTemplate;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTelegrafConfigGenerator() throws Exception {
		String uri = "/telegraf-config/generate";

		TelegrafConfiguration request = new TelegrafConfiguration();
		request.setInputHttpJsonName("robert-test-01");

		// reference -->> https://github.com/docker-java/docker-java
		DockerConfiguration dockerConfiguration = new DockerConfiguration();
		dockerConfiguration.setDockerHost("tcp://200.200.200.205:2375");
		dockerConfiguration.setDockerTlsVerify("http");
		List<String> dockerContainersNameFilter = new ArrayList<String>();
		dockerContainersNameFilter.add("influx");
		dockerConfiguration.setDockerContainersNameFilter(dockerContainersNameFilter);

		request.setDockerConfiguration(dockerConfiguration);

		String response2 = restTemplate.postForObject(uri, request, String.class);
		LOGGER.info(response2);
	}

}
