package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonToObj {
    public static Object mapJson(String fileName, Class classToMap) {
        ObjectMapper mapper = new ObjectMapper();
        Object jsonToJava = null;
        try {
            File json = new File(fileName);
            jsonToJava = mapper.readValue(json, classToMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonToJava;
    }
}
