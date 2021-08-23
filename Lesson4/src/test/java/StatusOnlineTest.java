import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class StatusOnlineTest extends BaseTest{

    @Test
    void getStatusOnlineTest(){

        given()
                .spec(requestSpecification)
                .when()
                .expect()
                .body("response",is(1))
                .when()
                .get("https://api.vk.com/method/account.setOnline?voip=0&access_token=1bd3f9dbef2385e35aec023addf556a5d6cb1a059cdbd64f138681ee546be44ed3e9322140581e9e11e37&v={v}",v)
                .prettyPeek()
                .then()
                .spec(responseSpecification);
    }
}
