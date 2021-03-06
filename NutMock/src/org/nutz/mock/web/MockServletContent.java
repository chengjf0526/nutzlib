package org.nutz.mock.web;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.nutz.lang.Lang;

public class MockServletContent extends MockWebObject implements ServletContext {

	public int getMajorVersion() {
		throw Lang.noImplement();
	}

	public String getMimeType(String arg0) {
		throw Lang.noImplement();
	}

	public int getMinorVersion() {
		throw Lang.noImplement();
	}

	public RequestDispatcher getNamedDispatcher(String arg0) {
		throw Lang.noImplement();
	}

	public String getRealPath(String arg0) {
		throw Lang.noImplement();
	}

	public RequestDispatcher getRequestDispatcher(String arg0) {
		throw Lang.noImplement();
	}

	public URL getResource(String name) throws MalformedURLException {
		return getClass().getResource(name);
	}

	public InputStream getResourceAsStream(String name) {
		return getClass().getResourceAsStream(name);
	}

	public Set<URL> getResourcePaths(String name) {
		try {
			HashSet<URL> hashSet = new HashSet<URL>();
			Enumeration<URL> enumeration;
			enumeration = getClass().getClassLoader().getResources(name);
			while (enumeration.hasMoreElements()) {
				URL url = (URL) enumeration.nextElement();
				hashSet.add(url);
			}
			return hashSet;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getServerInfo() {
		throw Lang.noImplement();
	}

	public Servlet getServlet(String name) throws ServletException {
		throw Lang.noImplement();
	}
	
	private String servletContextName;

	public String getServletContextName() {
		return servletContextName;
	}
	
	public void setServletContextName(String servletContextName) {
		this.servletContextName = servletContextName;
	}

	public Enumeration<String> getServletNames() {
		throw Lang.noImplement();
	}

	public Enumeration<Servlet> getServlets() {
		throw Lang.noImplement();
	}

	public void log(String arg0) {
		log.info(arg0);
	}

	public void log(Exception arg0, String arg1) {
		log.info(arg1,arg0);
	}

	public void log(String arg0, Throwable arg1) {
		log.info(arg0,arg1);
	}
	
	private Map<String, Object> attributeMap = new HashMap<String, Object>();

	public void removeAttribute(String key) {
		attributeMap.remove(key);
	}

	public void setAttribute(String key, Object value) {
		attributeMap.put(key, value);
	}

	public Object getAttribute(String key) {
		return attributeMap.get(key);
	}

	public Enumeration<String> getAttributeNames() {
		return new Vector<String>(attributeMap.keySet()).elements();
	}

	public ServletContext getContext(String arg0) {
		throw Lang.noImplement();
	}

}
