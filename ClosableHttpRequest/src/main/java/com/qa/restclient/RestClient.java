package com.qa.restclient;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.qa.restbase.RestBase;

public class RestClient extends RestBase{

	
	public void get(String url) throws ClientProtocolException, IOException {
		
		
	    CloseableHttpClient httpclient = HttpClients.createDefault();
	    HttpGet httpget  = new HttpGet(url);
	    CloseableHttpResponse closeableHttpResponce   =  httpclient.execute(httpget);
	    
	    //a statusCode
	    int statusCode = closeableHttpResponce.getStatusLine().getStatusCode();
	    System.out.println("status code ="+ statusCode);
	    
	    //b Json String
	    
	   String responseString =  EntityUtils.toString(closeableHttpResponce.getEntity(),"UTF-8");
	   JSONObject responseJson = new JSONObject(responseString);
	   
	   System.out.println("responseJson="+ responseJson);
	   
	   //All Headers
	   Header[] headersArray = closeableHttpResponce.getAllHeaders();
	   HashMap<String, String> allHeaders = new HashMap<String, String>();
	   for(Header header : headersArray) {
		   allHeaders.put(header.getName(), header.getValue());
	   }
	   System.out.println("Header array="+  allHeaders);
     
	    }

}
