package be.jeroenbellen.restsandbox.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class PirateControllerTest {

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = standaloneSetup(new PirateController()).build();
    }

    @Test
    public void sayHi() throws Exception {
        mockMvc.perform(get("/hi").content("Jack"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_PLAIN))
                .andExpect(content().string("Ahoy, Jack"));
    }

    @Test
    public void myShip() throws Exception {
        final ResultActions perform = mockMvc.perform(get("/myShip"));
        perform
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("{\"name\":\"Royal Fortune\",\"type\":\"Frigate\",\"captain\":\"Bartholomew Roberts\"}"));
    }

}
