package com.dio.cadastro;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.dio.cadastro.controller.PessoaController;
import com.dio.cadastro.service.PessoaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PessoaController.class)
public class PessoaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PessoaService pessoaService; // Mocking the PessoaService

    @Test
    public void testListarPessoas() throws Exception {
        mockMvc.perform(get("/api/pessoas"))
                .andExpect(status().isOk());
    }
}
