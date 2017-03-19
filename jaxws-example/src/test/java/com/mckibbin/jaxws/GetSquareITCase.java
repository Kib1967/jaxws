package com.mckibbin.jaxws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GetSquareITCase {
	
	private static final String SERVICE_BASE_URI_PROPERTY = "getSquareServiceBaseURI";
	
	private String serviceBaseURI;
	
	@Before
	public void setServiceBaseURI() {
		serviceBaseURI = System.getProperty(SERVICE_BASE_URI_PROPERTY);
	}

	@Test
	public void test() throws Exception {
		URL wsdlURL = new URL(serviceBaseURI + "?wsdl");
		Service service = Service.create(wsdlURL, new QName("com.mckibbin", "GetSquare"));
		GetSquare getSquare = service.getPort(GetSquare.class);
		int result = getSquare.getSquare(4);
		
		Assert.assertEquals("Expected this result", 16, result);
	}
}
