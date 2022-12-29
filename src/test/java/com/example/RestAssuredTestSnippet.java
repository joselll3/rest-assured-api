package com.example;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredTestSnippet {

	public static void main(String[] args) {

		String jsonString = "{\"email\": \"eve.holt@reqres.in\",\"password\": \"pistol\"}";
		Response response = given().contentType(ContentType.JSON).body(jsonString)
				.post("https://reqres.in/api/register");

		response.prettyPrint();
	}

}
