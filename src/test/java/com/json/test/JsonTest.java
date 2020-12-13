package com.json.test;

import com.json.Company;
import com.json.JsonToObj;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class JsonTest {

    List<Company> companies = JsonToObj.getCompanies();

    @Test
    public void containExistingCompany() {
        Company existingCompany = new Company("Amazon Address", "LA", "123456");
        assertTrue(companies.contains(existingCompany));
    }

    @Test
    public void containUnexistingCompany() {
        Company unexistingCompany = new Company("Rozetka Address", "LA", "122123");
        assertFalse(companies.contains(unexistingCompany));
    }
}
