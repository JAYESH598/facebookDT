
package com.qa.Test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.restbase.RestBase;
import com.qa.restclient.RestClient;


public class RestTest extends RestBase{
	RestBase helperbase;
	String serviceURL;
	String apiUrl;
	String url;
	RestClient rc;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException{
		helperbase = new RestBase();
		
		serviceURL= prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		//https://reqres.in/api/users
		
		url = serviceURL + apiUrl;
	}
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		
	    rc = new  RestClient();
		rc.get(url);
		
		
	}

	
	
	
}
