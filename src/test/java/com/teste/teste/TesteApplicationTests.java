package com.teste.teste;

import com.teste.teste.calculo.service.CalculoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TesteApplicationTests {
	@InjectMocks
	private CalculoService service;

	@Test
	void contextLoads() {
	}

	@Test
	void create_calculo_should_return13() {
		Integer response = service.getCalculoByNumber(7);
		assertEquals(13, response);
	}

	@Test
	void create_calculo_should_return144() {
		Integer response = service.getCalculoByNumber(12);
		assertEquals(144, response);
	}
}
