package dev.java.design.pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Structural Design Pattern
 * 
 * Proxy: Another layer of security for accessing the object
 * 
 * @author karth
 *
 */
public class Proxy {

	public static void main(String[] args) {
		NetBanking nb = new ProxyOTP();
		try {
			nb.login("user", 1234);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

interface NetBanking {
	public void login(String username, int invalidOTP) throws Exception;
}

class Authentication implements NetBanking {
	@Override
	public void login(String username, int invalidOTP) throws Exception {
		System.out.println("Sucessfully logged into" + username);
	}

}

class ProxyOTP implements NetBanking {
	private NetBanking auth = new Authentication();
	// static block accept only static variables
	private static List<Integer> ltInvalidOTP;

	static {
		ltInvalidOTP = new ArrayList<>();
		ltInvalidOTP.add(0000);
		ltInvalidOTP.add(1111);
		ltInvalidOTP.add(2222);
		ltInvalidOTP.add(3333);
		ltInvalidOTP.add(4444);
		ltInvalidOTP.add(5555);
	}

	@Override
	public void login(String username, int invalidOTP) throws Exception {
		if (ltInvalidOTP.contains(invalidOTP)) {
			throw new Exception("Access Denied");
		} else {
			auth.login(username, invalidOTP);
		}
	}

}