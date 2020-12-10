package com.hrms.steps;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetBrokenLinkensStep {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.google.com");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		int rs = conn.getResponseCode();
		System.out.println(rs);

	}

}
