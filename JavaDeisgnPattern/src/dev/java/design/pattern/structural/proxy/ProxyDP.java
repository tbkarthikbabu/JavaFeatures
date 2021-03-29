/**
 * 
 */
package dev.java.design.pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * proxy is other way of accessing the same functiolity
 * 
 * CASH Withdrawl: One way Direct Bank from Challan and other ways like Cash
 * Withdrwal from ATM card (Proxy)
 * 
 * Proxy sites used to block the unwanted sites for our own network sothat we
 * can control our network to avoid the external/unwanted sites
 * 
 * @author karth
 *
 */
public class ProxyDP {

	public static void main(String[] args) {

		Internet net = new ProxyNet();
		try {
			net.connectTo("44545.com");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

interface Internet {
	public void connectTo(String host) throws Exception;
}

class DirectNet implements Internet {

	@Override
	public void connectTo(String host) {
		System.out.println("Connecting to...." + host);

	}

}

class ProxyNet implements Internet {

	private Internet direct = new DirectNet();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("aaa.com");
		bannedSites.add("XXX.com");
	}

	@Override
	public void connectTo(String host) throws Exception {
		if (bannedSites.contains(host)) {
			throw new Exception("Access Denied");
		}
		direct.connectTo(host);

	}

}
