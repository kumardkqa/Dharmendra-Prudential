package restApiTest;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CallAPIBDD {

	@Test
	public void get_cityWeatherDetail() {
		
		given().
		when().get("api.openweathermap.org/data/2.5/weather?q=London").
		then().statusCode(200).and().
		body("coord.name", hasValue("London"));
        		
		
	}
}
