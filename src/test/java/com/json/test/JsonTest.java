package com.json.test;

import com.json.Company;
import com.json.JsonToObj;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class JsonTest {

    List<Company> companies = JsonToObj.getCompany();

    @Test
    public void containExistingCompany() {
        Company existingCompany = new Company("Amazon Address", "LA", "123456");
        assertTrue(contain(existingCompany, companies));
    }

    @Test
    public void containUnexistingCompany() {
        Company unexistingCompany = new Company("Rozetka Address", "LA", "122123");
        assertFalse(contain(unexistingCompany, companies));
    }

    public boolean contain(Company company, List<Company> companies) {
        System.out.println(company);
        for (Company comp : companies) {
            if (company.equals(comp)) {
                return true;
            }
        }
        return false;
    }
}
