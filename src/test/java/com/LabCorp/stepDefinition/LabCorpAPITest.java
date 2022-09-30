package com.LabCorp.stepDefinition;

import com.LabCorp.pojo.LabCorpBody;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.math3.stat.inference.OneWayAnova;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LabCorpAPITest {

    LabCorpBody labCorpBodyPost = new LabCorpBody();
    public LabCorpBody labCorpBodyGet;
    String url;


    @Given("json body and API url")
    public void jsonBodyAndAPIUrl() {
        url = "https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users";
    }
    @When("i use Post request , i should see status code 201")
    public void iUsePostRequestIShouldSeeStatusCode() {
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

        int idFromPost = given().accept(ContentType.JSON).log().all()
                .and()
                .contentType(ContentType.JSON)
                .body(labCorpBodyPost)
                .when().
                post(url)
                .then()
                .statusCode(201)
                .extract().response().jsonPath().getInt("data.id");

        System.out.println(idFromPost);

    }

    @And("when i use Get request, the response have to be a json body i just created and status code 200")
    public void whenIUseGetRequestTheResponseHaveToBeAJsonBodyIJustCreatedAndStatusCode() {
        labCorpBodyGet = given().accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .log().all().extract().response().as(LabCorpBody.class);
    }

    @Then("i should assert to make sure that json body contains the same information")
    public void iShouldAssertToMakeSureThatJsonBodyContainsTheSameInformation() {

        assertThat(labCorpBodyGet.getEmployeeFirstname(),is(labCorpBodyPost.getEmployeeFirstname()));
        assertThat(labCorpBodyGet.getEmployeeLastname(),is(labCorpBodyPost.getEmployeeLastname()));
        assertThat(labCorpBodyGet.getEmployeePhonenumbe(),is(labCorpBodyPost.getEmployeePhonenumbe()));
        assertThat(labCorpBodyGet.getAdemployeeEmaildress(),is(labCorpBodyPost.getAdemployeeEmaildress()));
        assertThat(labCorpBodyGet.getCitemployeeAddressy(),is(labCorpBodyPost.getCitemployeeAddressy()));
        assertThat(labCorpBodyGet.getStateemployeeDevLevel(),is(labCorpBodyPost.getStateemployeeDevLevel()));
        assertThat(labCorpBodyGet.getEmployeeGender(),is(labCorpBodyPost.getEmployeeGender()));
        assertThat(labCorpBodyGet.getEmployeeHireDate(),is(labCorpBodyPost.getEmployeeHireDate()));
        assertThat(labCorpBodyGet.getEmployeeOnleave(),is(labCorpBodyPost.getEmployeeOnleave()));
    }


    @When("i use Post request , i should see status code 400 and there is a error message")
    public void iUsePostRequestIShouldSeeStatusCode400() {
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

        String expectedErrorMessage = "Max number of elements reached for this resource!";

        Response response = given().accept(ContentType.JSON).log().all()
                .and()
                .contentType(ContentType.JSON)
                .body(labCorpBodyPost)
                .when().
                post(url)
                .then()
                .statusCode(400)
                .body("error message", is(expectedErrorMessage))
                .extract().response();
        System.out.println(response.statusCode());
    }


}
