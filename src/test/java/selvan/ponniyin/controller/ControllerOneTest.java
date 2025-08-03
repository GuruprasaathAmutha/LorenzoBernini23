package selvan.ponniyin.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import selvan.ponniyin.service.TaskSvc;

import static org.junit.jupiter.api.Assertions.*;



@WebMvcTest(ControllerOne.class)
class ControllerOneTest {


    @Autowired
    private MockMvc mockMvc;

    @Mock
    private TaskSvc taskSvc;

    @Test
    void newTaskTest() throws Exception{

    }



}