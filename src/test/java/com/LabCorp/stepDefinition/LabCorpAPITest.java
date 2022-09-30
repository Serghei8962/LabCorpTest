package com.LabCorp.stepDefinition;

import com.LabCorp.pojo.LabCorpBody;
import io.restassured.http.ContentType;
import org.apache.commons.math3.stat.inference.OneWayAnova;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class LabCorpAPITest {

@Test
    public void test1(){

    LabCorpBody labCorpBodyPost = new LabCorpBody();
    labCorpBodyPost.setCreatedAt(1631825833);
    labCorpBodyPost.setEmployeeFirstname("TestData12345");
    labCorpBodyPost.setEmployeeLastname("TestData12345");
    labCorpBodyPost.setEmployeePhonenumbe("264-783-9453");
    labCorpBodyPost.setAdemployeeEmaildress("ademployee_emaildress 1");
    labCorpBodyPost.setCitemployeeAddressy("citemployee_addressy 1");
    labCorpBodyPost.setStateemployeeDevLevel("stateemployee_dev_level 1");
    labCorpBodyPost.setEmployeeGender("employee_gender 1");
    labCorpBodyPost.setEmployeeHireDate("2025-10-31T16:35:45.426Z");
    labCorpBodyPost.setEmployeeOnleave(true);
    labCorpBodyPost.setTechStack(null);
    labCorpBodyPost.setProject(null);

        int createdAtPost = given().accept(ContentType.JSON).log().all()
                .and()
                .contentType(ContentType.JSON)
                .body(labCorpBodyPost)
                .when().
                post("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users")
                .then()
                .statusCode(201)
                .extract().response().jsonPath().getInt("data.createdAt");

    System.out.println(createdAtPost);

    LabCorpBody labCorpBodyGet = given().accept(ContentType.JSON)
            .when()
            .get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users")
            .then()
            .statusCode(200)
            .log().all().extract().response().as(LabCorpBody.class);


}

}
