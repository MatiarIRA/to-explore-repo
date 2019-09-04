package com.response.headers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GzipUtility {
	//Checks if Gzip is supported by the browser
	public static boolean isGzipSupported(HttpServletRequest req) {
		String encoding = req.getHeader("Accept-Encoding");
		return (encoding !=null ) && (encoding.contains("gzip"));
	}
	//Verify if Gzip is enable
	public static boolean isGzipDisabled(HttpServletRequest req) {
		String flag = req.getHeader("disableGzip");
		return (flag !=null ) && (!flag.equalsIgnoreCase("false"));
	}
	//To encode the regular http response and print the object
	public static PrintWriter getGzipWriter(HttpServletResponse res) throws IOException {
		return (new PrintWriter(new GZIPOutputStream(res.getOutputStream())));
	}

}
