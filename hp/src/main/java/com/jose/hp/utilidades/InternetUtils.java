package com.jose.hp.utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class InternetUtils {
	
	
	public static String readUrl(String web) {
		try {
			URL url = new URL(web);
			URLConnection uc = url.openConnection();
			uc.setRequestProperty("User-Agent", "PostmanRuntime/7.20.1");
			uc.connect();
			String lines = new BufferedReader(new InputStreamReader(uc.getInputStream(), StandardCharsets.UTF_8))
				.lines().collect(Collectors.joining());
			// System.out.println(lines);
			return lines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido leer la URL: " + web);
			System.out.println(e.getStackTrace() + " " + e.getCause());
		}
		return null;
	}
	
	public static String readUrl(String web, String token) {
		try {
			URL url = new URL(web);
			URLConnection uc = url.openConnection();
			uc.setRequestProperty("User-Agent", "PostmanRuntime/7.20.1");
			uc.setRequestProperty("X-Auth-Token", token);
			uc.connect();
			String lines = new BufferedReader(new InputStreamReader(uc.getInputStream(), StandardCharsets.UTF_8))
					.lines().collect(Collectors.joining());
			// System.out.println(lines);
			return lines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido la leer la URL: " + web);
		}
		return null;
	}
	
	
	public static List<String> readUrlList(String web) {
		try {
			URL url = new URL(web);
			URLConnection uc = url.openConnection();
			uc.setRequestProperty("User-Agent", "PostmanRuntime/7.20.1");
			uc.connect();
			List<String> lines = new BufferedReader(new InputStreamReader(uc.getInputStream(), StandardCharsets.UTF_8))
				.lines().collect(Collectors.toList());
			// System.out.println(lines);
			return lines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido leer la URL: " + web);
			System.out.println(e.getStackTrace() + " " + e.getCause());
		}
		return null;
	}
	
	public static List<String> readUrlList(String web, String token) {
		try {
			URL url = new URL(web);
			URLConnection uc = url.openConnection();
			uc.setRequestProperty("User-Agent", "PostmanRuntime/7.20.1");
			uc.setRequestProperty("X-Auth-Token", token);
			uc.connect();
			List<String> lines = new BufferedReader(new InputStreamReader(uc.getInputStream(), StandardCharsets.UTF_8))
					.lines().collect(Collectors.toList());
			// System.out.println(lines);
			return lines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido la leer la URL: " + web);
		}
		return null;
	}
	

}