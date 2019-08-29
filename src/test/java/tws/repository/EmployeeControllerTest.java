package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import tws.controller.EmployeeController;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class) // 需要测试的 Controller
public class EmployeeControllerTest {
	
//	@Autowired
//    private MockMvc mockMvc;
//	@Test
//    public void testPost() throws Exception {
//        MvcResult mvcResult = mockMvc.perform(post("/employee") //设置请求方式为 post 及 url
//                .accept(MediaType.APPLICATION_JSON) // 设置入参方式为json
//                .param("lastName", "wu")
//                .param("email", "wangwu@xx.com")
//                .contentType(MediaType.APPLICATION_JSON)) // 设置出参方式json
//                .andExpect(status().isOk()) // 设置请求的状态码为 200，可以添加一些期望的响应的结果判断
//                .andDo(print()) // print 方法打印出请求体，响应体
//                .andReturn(); // 获取返回值MvcResult
//        System.out.println(mvcResult.getResponse().getContentAsString());
//
//        testGetAll();
//    }

}
