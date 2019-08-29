package tws.repository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import tws.controller.ParkingLotController;

@RunWith(SpringRunner.class)
@WebMvcTest(ParkingLotController.class) // 需要测试的 Controller
public class ParkingLotControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Test
    public void should_return_all_parkingLots() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/parkingLots")
        		.andDo(print())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
	
	@Test
    public void insert_test() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/parkingLots") 
                .accept(MediaType.APPLICATION_JSON) 
                .param(1,30,20)
                .contentType(MediaType.APPLICATION_JSON)) 
                .andExpect(status().isOk())
                .andDo(print()) 
                .andReturn(); // 获取返回值MvcResult
        System.out.println(mvcResult.getResponse().getContentAsString());

        should_return_all_parkingLots();
    }

}
