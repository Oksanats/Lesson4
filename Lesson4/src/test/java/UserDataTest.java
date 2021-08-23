import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UserDataTest extends BaseTest{

    @Test
    void getAccountIdTest(){

        given()
                .spec(requestSpecification)
                .when()
                .get("https://api.vk.com/method/users.get?user_id={id}&v=5.52",id)
                .prettyPeek()
                .then()
                .spec(responseSpecification);
    }

}
