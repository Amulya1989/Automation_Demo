package stepdefinations;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;


public class POC_new {

	public static RequestSpecification Obj1=null;
	public static Response response=null;
	
	public static void main(String[] args) {
		 RestAssured.baseURI = "https://njtqa-app1.cmsservices.us";
		 RequestSpecification request = RestAssured.given();
		 
		 RestAssured.port = 8080;
		 
		
		
		JSONArray list = new JSONArray();
		
		Map<String,String> Obj = new HashMap<>();
		//Multimap<String, String> Obj = ArrayListMultimap.create();
		
		Obj.put("APP_STATE", "ENABLED");
		Obj.put("device_phone_number", "6095800190");
		Obj.put("device_imei_number", "POSTMAN-IMEI-990004819497300");
		Obj.put("device_id", "POSTMAN-990004819497300");
		Obj.put("trx_time", "20171222154527");
		Obj.put("app_version", "2017.2.0i");
		Obj.put("app_id", "990004819497300_6095800190_20171222154527");
		Obj.put("app_interface_version", "18.1");
		Obj.put("os_sdk_version", "6.0.1");
		Obj.put("device_manufacturer_version", "samsung");
		Obj.put("device_model", "SM-G900V");
		Obj.put("carrier_name", "Verizon Wireless");
		Obj.put("network_type", "13");
		Obj.put("country_code", "us");
		Obj.put("rooted", "n");
		Obj.put("device_os", "android");
		
		//--------------
		Gson gson = new Gson();
        Type gsonType = new TypeToken<HashMap>(){}.getType();
        String gsonString = gson.toJson(Obj,gsonType);
        System.out.println("All JSON DATA = "+gsonString);
		//--------------
		/*
		JSONObject Obj1 = new JSONObject();
		Obj1.put("action", "authenticate");
		Obj1.put("version", "20.2");
		Obj1.put("f", "json");
		Obj1.put("data", gsonString);
		*/
		request.formParam("action", "authenticateuser");

		request.formParam("version", "20.2");

		request.formParam("f", "json");

		request.formParam("data", gsonString);
		
		//request.header("Content-Type", "application/x-www-form-urlencoded");
		//request.body(Obj1.toString());
		Response response = request.post("/njtmas/rest/ActionController");
		int statusCode = response.getStatusCode();
		System.out.println("Status Code = "+statusCode);
		ResponseBody statusSMS = response.body();
		//Response resp = given().contentType(ContentType.JSON).log().all().body(Obj).post();
		System.out.println("Body Massage "+statusSMS);
		response.prettyPrint();
		
		
		 
	
	}

}
