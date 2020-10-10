package com.chatbot.permit.municipal;

import com.chatbot.permit.municipal.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MunicipalPermitChabotApplicationTests {

  @Autowired
  private MainController mainController;
  @Autowired
  private MockMvc mockMvc;

  @Test
  void contextLoads() {
    assertThat(mainController).isNotNull();
  }

  @Test
  public void shouldReturnCorrectPolygonID() throws Exception {
    Object location = new Object() {
      public String location = "360 N Arroyo Blvd, Pasadena, CA 91103";
    };
    ObjectMapper locationMapper = new ObjectMapper();
    String locationJson = locationMapper.writeValueAsString(location);

    this.mockMvc.perform(post("/geocode")
            .content(locationJson)
            .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
  }

}
