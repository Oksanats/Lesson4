
;
import InfoUser.UserInfo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;


public class UserInfoTest extends BaseTest{
    @Test
    void getUserInfoTest(){


       UserInfo response = given()
                .spec(requestSpecification)
                .when()
                .get("https://api.vk.com/method/account.getProfileInfo?PARAMS&" +
                        "access_token=1bd3f9dbef2385e35aec023addf556a5d6cb1a059cdbd64f138681ee546be44ed3e9322140581e9e11e37&v={v}",v)
                .prettyPeek()
                .then()
                .extract()
                .body()
                .as(UserInfo.class);
        assertThat(response.getResponse().getId(),equalTo(295422002));
        assertThat(response.getResponse().getSex(),equalTo(1));
        assertThat(response.getResponse().getFirstName(), containsString("Оксана"));

    }


}
