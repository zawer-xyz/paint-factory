package xyz.zawer.paintfactory.controllers

import org.hamcrest.CoreMatchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import java.net.URI

@SpringBootTest
@RunWith(SpringRunner::class)
class PaintBucketControllerTest {

    @Autowired lateinit var context: WebApplicationContext
    lateinit var mockMvc: MockMvc

    @Before
    fun setUp()  {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(this.context)
                .build()
    }

    @Test
    fun createBucket() {
        this.mockMvc.perform(post(URI("/bucket"))
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"color\": \"azul\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", CoreMatchers.notNullValue()))
    }
}
