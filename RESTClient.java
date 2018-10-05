package com.samplerestclient.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * REST Client
 * 
 * @author Sivaprasad
 *
 */

public class RESTClient {

	public static void main(String[] args) {
		try {
			/* ------
			 *   USING JERSERY  
			 * ------
			 */
			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/Sample_REST_Service/getService/getData");

			String data = "{\"name\":\"sivaprasad\",\"email\":\"sk.sivaprasadk@gmail.com\"}";
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, data);

			System.out.println("Response from Server:");
			String serverResponse= response.getEntity(String.class);
			System.out.println(serverResponse);
			
		 } catch (Exception e) {

			e.printStackTrace();

		 }

	}
}
