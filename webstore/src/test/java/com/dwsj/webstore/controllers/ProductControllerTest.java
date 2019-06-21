/*
package com.dwsj.webstore.controllers;

import com.dwsj.webstore.product.model.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.dwsj.webstore.product.controller.ProductController;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    private ProductController controller;


    @Test
    public void getAllProductsAPI() throws Exception
    {
        mvc.perform( MockMvcRequestBuilders
                .get("/products/")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.employees").doesNotExist());
    }
//
//    @Test
//    public void getProductByIdAPI() throws Exception
//    {
//        mvc.perform( MockMvcRequestBuilders
//                .get("/products/{id}", 1)
//                .accept(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.employeeId").value(1));
//    }

    @Test
    public void testExample() throws Exception {
        given(this.controller.gpbi(1))
                .willReturn(new Product("name",100,"category","description",100,100, null));

            this.mvc.perform(get("/products/").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk()).andExpect((ResultMatcher) content().string("name 100 category description 100 100 null"));
    }


    @Test
    public void test_get_all_success() throws Exception {
        List<Product> products = Arrays.asList(
                new Product(1,"name",1,"category","description",1,1,null));
        when(controller.gap()).thenReturn(products);

        mvc.perform(get("/products/"))
                .andExpect(status().isOk());
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].id", is(1)))
//                .andExpect(jsonPath("$[0].username", is("Daenerys Targaryen")))
//                .andExpect(jsonPath("$[1].id", is(2)))
//                .andExpect(jsonPath("$[1].username", is("John Snow")));
//        verify(userService, times(1)).getAll();
//        verifyNoMoreInteractions(userService);
    }
//
//    @Test
//    public void test_get_by_id_success() throws Exception {
//
//        Product product =
//                new Product(1,"name",1,"category","description",1,1,null);
//        when(controller.gpbi(1)).thenReturn(product);
//
//        mvc.perform(get("/users/{id}", 1))
//                .andExpect(status().isOk());
//    }



}
*/