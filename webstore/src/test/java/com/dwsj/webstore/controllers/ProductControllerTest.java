package com.dwsj.webstore.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.dwsj.webstore.product.controller.ProductController;
import com.dwsj.webstore.product.model.Product;
import com.dwsj.webstore.product.service.ProductService;
import com.dwsj.webstore.util.JsonConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.mockito.Mock;
import org.springframework.test.web.servlet.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.validation.constraints.AssertTrue;


@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ProductService productService;

    @Test
    public void getProductById() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders
                .get("/products/id/{id}",1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(1));
    }


    @Test
    public void addProduct() throws Exception {

        Product product = new Product();
        product.setId(987654);
        product.setCategory("PC and Laptops");
        product.setDescription("description example");
        product.setInStock(200);
        product.setName("HP");
        product.setPrice(5000);
        product.setSold(2);





        mockMvc.perform( MockMvcRequestBuilders
                .post("/products/add")
                .content(JsonConverter.toJson(product))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated() )
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").exists());
    }


    @Test
    public void deleteProductById() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.delete("/products/delete/{id}", 1) )
                .andExpect(status().isAccepted());
    }


}