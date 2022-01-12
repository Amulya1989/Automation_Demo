package stepdefinations;

import io.restassured.specification.RequestSpecification;
import java.nio.file.Files;

import java.nio.file.Paths;

 

import org.json.JSONObject;

import org.testng.Assert;

 

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import io.restassured.response.Response;


public class POC {

public static RequestSpecification httpRequest=null;
public static RequestSpecification httpRequest1=null;
 public static Response response=null;
 public static Response response1=null;
 public static JSONObject jsonObject = null;
 public static JSONObject jsonObject1 = null;
	     public static void main(String[] args) {

	        

	        

	         if(httpRequest==null)

	         {

	        

	              RestAssured.baseURI = "https://njtqa-app1.cmsservices.us";

	             

	              RestAssured.useRelaxedHTTPSValidation();

	              httpRequest = RestAssured.given().log().all();

	         }

	         else

	         {

	              System.out.println(" HttpRequest is not null");

	         }

	        

	         String filepath = System.getProperty("user.dir")+"/"+"data.json";

	         try {
	             
	              String jsonContents  = new String((Files.readAllBytes(Paths.get(filepath))));

	              jsonObject = new JSONObject(jsonContents);

	             

	         } catch (Exception ex) {

	              ex.printStackTrace();

	         }

	        

	         httpRequest.formParam("action", "authenticateuser");

	         httpRequest.formParam("version", "20.2");

	         httpRequest.formParam("f", "json");

	         httpRequest.formParam("data", jsonObject.toString());

	       //  JSONObject json1 = new JSONObject();
	         

	     System.out.println("***************************************************************************");

	         response = httpRequest.post("/njtmas/rest/ActionController");
	          System.out.println("Status code : "+response.getStatusCode());
	          System.out.println("Response : ");

	         System.out.println("============================== ");

	         System.out.println("");

	         System.out.println(response.asString());
	          Assert.assertEquals(200, response.getStatusCode());

	          Assert.assertNotNull(response.asString());
             JsonPath js = new JsonPath(response.asString());

             String status_msg = js.get("data.status_msg");

             System.out.println("status_msg : "+status_msg);
	            
             Assert.assertEquals("Success" ,js.get("data.status_msg") );
      //--------------------------------------------------------------------------------------------------------------
            
             httpRequest1 = RestAssured.given().log().all();
             
             String filepath_purchase = System.getProperty("user.dir")+"/"+"data_purchase.json";

	         try {
	             
	              String jsonContents_Purchase  = new String((Files.readAllBytes(Paths.get(filepath_purchase))));

	              jsonObject1 = new JSONObject(jsonContents_Purchase);

	             

	         } catch (Exception ex) {

	              ex.printStackTrace();

	         }
	         httpRequest.formParam("action", "purchase");

	         httpRequest.formParam("version", "20.2");

	         httpRequest.formParam("f", "json");

	         httpRequest.formParam("data", jsonObject1.toString());
	         System.out.println("***************************************************************************");

	         response1 = httpRequest.post("/njtmas/rest/ActionController");
	         System.out.println("Status purchase code : "+response1.getStatusCode());
	          System.out.println("Response : ");
	          System.out.println(response1.asString());
	          Assert.assertEquals(200, response1.getStatusCode());

	          Assert.assertNotNull(response1.asString());
             JsonPath js1 = new JsonPath(response1.asString());

             String status_msg1 = js1.get("data.status_msg");

             System.out.println("Purchase status_msg : "+status_msg1);
	         System.out.println("============================== ");
	         
	         
	         
	     }
		

	}


