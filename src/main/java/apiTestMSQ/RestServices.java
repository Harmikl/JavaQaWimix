package apiTestMSQ;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;


import static io.restassured.RestAssured.given;

/**
 * created by maksimkharmak , 22.08.21
 */
public class RestServices {
    private final static String BASE_URL = "https://develop.msq.ai";
    private final static String LOGIN_END_POINT = "/endpoints/platform/auth/login";
    private final static String EMAIL = "xiharmikl57@gmail.com";
    private final static String PASSWORD = "Qwerty123*";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public apiTestMSQ.Token getToken(){
        String body = String.format("{\"email\": \"%s\"," +
                        "\"password\": \"%s\"}",
                EMAIL,
                PASSWORD);

        String s ="OK";
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(BASE_URL + LOGIN_END_POINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .body("email",equalTo("xiharmikl57@gmail.com"))
                .extract()
                .as(apiTestMSQ.Token.class);
    }

}
