/*
 * package com.webservice.spring.controller;
 * 
 * 
 * import static io.restassured.RestAssured.given; import static
 * io.restassured.RestAssured.with;
 * 
 * import org.json.simple.JSONObject; import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.fasterxml.jackson.databind.ObjectMapper; import
 * com.webservice.spring.domain.Hero;
 * 
 * import io.restassured.RestAssured; import io.restassured.http.ContentType;
 * import io.restassured.response.Response; import
 * io.restassured.specification.RequestSenderOptions;
 * 
 * @SpringBootTest public class HeroControllerTestByRestAssured {
 * 
 * // JSON Converter ( JSON to Java, JAVA to Json)
 * 
 * @Autowired ObjectMapper objectMapper;
 * 
 * @Autowired JSONObject j; //@Test public void getHeroeById() throws Exception
 * {
 * 
 * }
 * 
 * @Test public void getHeroes() throws Exception { // Print All
 * given().when().get("http:localhost:8081/getHeroes").then().log().all(); //
 * Print Body
 * given().when().get("http:localhost:8081/getHeroes").then().log().body(); //
 * Status Code
 * given().when().get("http:localhost:8081/getHeroes").then().log().status();
 * //Headers
 * given().when().get("http:localhost:8081/getHeroes").then().extract().headers(
 * ); // Response
 * System.out.println(given().when().get("http:localhost:8081/getHeroes").then()
 * .contentType(ContentType.JSON).extract().body().asString()); //Convert to
 * Hero Object Hero[] heroes =
 * given().when().get("http:localhost:8081/getHeroes").then().contentType(
 * ContentType.JSON).extract().body().as(Hero[].class); for(int
 * i=0;i<heroes.length;i++) {
 * System.out.println("The value of Id : "+heroes[i].getId());
 * System.out.println("The value of Name : "+heroes[i].getName()); } }
 * 
 * 
 * @Test public void getHeroes() throws Exception { // Print All RestAssured
 * .given().when().get("http:localhost:8081/getHeroes").then().log().all(); //
 * Print Body RestAssured
 * .given().when().get("http:localhost:8081/getHeroes").then().log().body(); //
 * Status Code RestAssured
 * .given().when().get("http:localhost:8081/getHeroes").then().log().status();
 * //Headers RestAssured
 * .given().when().get("http:localhost:8081/getHeroes").then().extract().headers
 * (); // Response //System.out.println(RestAssured.given().when().get(
 * "http:localhost:8081/getHeroes").then().contentType(ContentType.JSON).extract
 * ().body().asString()); //Convert to Hero Object Hero[] heroes =RestAssured.
 * given().when().get("http:localhost:8081/getHeroes").then().contentType(
 * ContentType.JSON).extract().body().as(Hero[].class); for(int
 * i=0;i<heroes.length;i++) {
 * System.out.println("The value of Id : "+heroes[i].getId());
 * System.out.println("The value of Name : "+heroes[i].getName()); } }
 * 
 * //@Test public void getHeroByName() throws Exception {
 * 
 * }
 * 
 * @Test public void saveHero() throws Exception { Hero hero = new Hero();
 * hero.setId(8); hero.setName("Sugu"); String jsonInput =
 * objectMapper.writeValueAsString(hero);
 * with().body(jsonInput).contentType(ContentType.JSON).when().post(
 * "http:localhost:8081/saveHero").then().statusCode(200); }
 * 
 * @Test public void saveHerospost() {
 * 
 * j.put("id","9"); j.put("name","mugundhanG"); Response
 * responsegetId=RestAssured .given() .param("","") .header("","") .when()
 * .post("http:localhost:8081/saveHero");
 * System.out.println(responsegetId.asString()); }
 * 
 * @Test public void getHeroid() {
 * //RestAssured.baseURI="http:localhost:8081/getHeroes"; Response
 * responsegetId=RestAssured .given() .param("","") .header("","") .when()
 * .get("http:localhost:8081/getHeroes/1");
 * System.out.println(responsegetId.asString());
 * 
 * 
 * } }
 */