package session;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;

public class RemoveAll {
	
	public static void attributes(HttpSession session){
		Enumeration<String> names=session.getAttributeNames();
		while(names.hasMoreElements()){
			String key=names.nextElement();
			session.removeAttribute(key);
		}
	}

}
