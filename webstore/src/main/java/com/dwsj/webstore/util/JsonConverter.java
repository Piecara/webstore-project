package com.dwsj.webstore.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {
    public static String toJson(Object object) {
        try {
            ObjectMapper objectMapper  = new ObjectMapper();
            return objectMapper.writeValueAsString(object);

        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }
        return "JSON ERROR";
    }
}
