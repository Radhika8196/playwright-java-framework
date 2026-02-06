package javapkg;

import java.io.File;

import io.restassured.path.json.JsonPath;


public class JsonPathTest {

	public static void main(String[] args) {

		File jsonFile = new File("/Users/manasvimannaru/Radhi/PlayWright/src/test/resources/jsonFile");
		JsonPath jsonPath = JsonPath.from(jsonFile);
		
	String name = jsonPath.getString("goods.name");
		
		System.out.println("Name of the goods: " + name);
		
		int price = jsonPath.getInt("goods.price");
		System.out.println("Price of the goods:" + price);
		
		System.out.println("Status of the goods: " + jsonPath.get("status"));


	}

}
