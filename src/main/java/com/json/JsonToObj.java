package com.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class JsonToObj {
    public static List<Company> getCompany() {

        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader("jsonTask.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONObject json = (JSONObject) obj;
        JSONObject manufacturers = (JSONObject) json.get("manufacturers");
        JSONObject childCompanies = (JSONObject) manufacturers.get("childCompanies");

        List<Company> companies = new LinkedList<>();
        for (Object key : childCompanies.keySet()) {
            companies.add(parseObject(childCompanies, key.toString()));
        }

        return companies;
    }

    private static Company parseObject(JSONObject childCompanies, String name) {
        JSONObject companyObject = (JSONObject) childCompanies.get(name);
        Company company = new Company();
        company.setAddress(companyObject.get("address").toString());
        company.setState(companyObject.get("state").toString());
        company.setPhone(companyObject.get("phone").toString());
        return company;
    }
}
