package apiTest.MSQ;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import static apiTest.MSQ.StaticUtils.getGeneratedEmail;
import static org.hamcrest.core.IsEqual.equalTo;


import static io.restassured.RestAssured.given;

/**
 * created by maksimkharmak , 22.08.21
 */
public class RestServices {
    private final static String BASE_URL = "https://develop.msq.ai";
    private final static String LOGIN_END_POINT = "/endpoints/platform/auth/login";
    private final static String REGISTER_END_POINT = "/endpoints/platform/auth/register";
    private final static String EMAIL = "xiharmikl57@gmail.com";
    public static String GENERATED_EMAIL = getGeneratedEmail()+"@gmail.com";
    private final static String PASSWORD = "Qwerty123*";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public Token getToken(){
        String body = String.format("{\"email\": \"%s\"," +
                        "\"password\": \"%s\"}",
                EMAIL,
                PASSWORD);

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
                .as(Token.class);
    }

    public Register registerUser(String email) throws IOException {
        return given()
                .contentType(ContentType.JSON)
                .body(initRegisterBodyFromJson(new Object[]{"email", email}))
                .when()
                .post(BASE_URL+REGISTER_END_POINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Register.class);
    }

    @SneakyThrows
    private Map<String,Object> initRegisterBodyFromJson(Object[]... field) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> body = mapper.readValue(new File("src/main/java/apiTest/MSQ/Register.json"),
                new TypeReference<Map<String, Object>>() {
                });
        Arrays.stream(field).forEach(f-> body.put((String )f[0],f[1]));
        return body;
    }
}
