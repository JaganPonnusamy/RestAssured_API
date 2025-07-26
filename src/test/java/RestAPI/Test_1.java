package RestAPI;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_1 {
	
	
	@Test
	public void Test1()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		response.getStatusCode();
		response.getTime();
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asPrettyString());
	}

}
