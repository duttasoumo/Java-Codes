package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jdk.nashorn.api.scripting.JSObject;

public class PHPtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=getJSON("http://localhost/pHp%20FIles/fetch_category.php");
		try {
			JSONObject job=new JSONObject(str);
			JSONArray jar=job.getJSONArray("data");
			for(int i=0;i<jar.length();i++){
				JSONObject j=jar.getJSONObject(i);
				System.out.println(j.getString("roll")+"\t"+j.getString("name")+"\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static String getJSON(String url) {
	        HttpURLConnection c = null;
	        try {
	            URL u = new URL(url);
	            c = (HttpURLConnection) u.openConnection();
	            c.setRequestMethod("GET");
	            c.setRequestProperty("Content-length", "0");
	            c.setUseCaches(false);
	            c.setAllowUserInteraction(false);
	            c.connect();
	            int status = c.getResponseCode();

	            switch (status) {
	                case 200:
	                case 201:
	                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
	                    StringBuilder sb = new StringBuilder();
	                    String line;
	                    while ((line = br.readLine()) != null) {
	                        sb.append(line+"\n");
	                    }
	                    br.close();
	                    System.err.println("url return"+sb.toString());
	                    return sb.toString();
	            }

	        } catch (MalformedURLException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            if (c != null) {
	                try {
	                    c.disconnect();
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        }
	        return "";
	    }
}
