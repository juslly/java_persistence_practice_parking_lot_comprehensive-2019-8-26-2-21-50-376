package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.core.PrettyPrinter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 

import tws.controller.EmployeeController;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class) // 需要测试的 Controller
public class EmployeeControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Test
    public void should_return_all_employees() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/employees")
        		.andDo(print())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
	
	@Test
    public void insert_test() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/employees") 
                .accept(MediaType.APPLICATION_JSON) 
                .param(1, "tom",23)
                .contentType(MediaType.APPLICATION_JSON)) 
                .andExpect(status().isOk())
                .andDo(print()) 
                .andReturn(); // 获取返回值MvcResult
        System.out.println(mvcResult.getResponse().getContentAsString());

        should_return_all_employees();
    }

}
