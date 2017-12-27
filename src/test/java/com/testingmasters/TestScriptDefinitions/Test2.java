package com.testingmasters.TestScriptDefinitions;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Test2 
{
	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		// Encode 
		String password = "testingmasters.selenium@gmail.com";
		String asB64 = Base64.getEncoder().encodeToString(password.getBytes("utf-8"));
		System.out.println(asB64);

		// Decode
		byte[] asBytes = Base64.getDecoder().decode(asB64);
		System.out.println(new String(asBytes, "utf-8")); 
	}
}
