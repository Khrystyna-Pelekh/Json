package com.json.test;

import com.json.JsonToObj;
import com.models.ChildCompany;
import com.models.Task;
import lombok.extern.java.Log;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log
public class JsonTest {

    Task _task;
    List<ChildCompany> childCompanies;

    @BeforeAll
    public void init() {
        _task = (Task) JsonToObj.mapJson("jsonTask.json", Task.class);
        childCompanies = _task.getManufacturers().getChildCompanies();
        for(ChildCompany childCompany : childCompanies){
            log.info(childCompany.toString());
        }
    }

    @Test
    public void containExistingCompany() {
        ChildCompany existingCompany = new ChildCompany("Amazon Address", "LA", "123456");
        assertTrue(childCompanies.contains(existingCompany));
    }

    @Test
    public void containUnexistingCompany() {
        ChildCompany unexistingCompany = new ChildCompany("Rozetka Address", "LA", "122123");
        assertFalse(childCompanies.contains(unexistingCompany));
    }
}
