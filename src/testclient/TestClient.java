package testclient;

import pkg.abstr.Image;
import pkg.proxy.ProxyImage;

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: Proxy\n");

		final Image ImageA = new ProxyImage("Photo1");
		final Image ImageB = new ProxyImage("Photo2");

		ImageA.displayImage(); // loading necessary
		ImageA.displayImage(); // loading unnecessary
		ImageB.displayImage(); // loading necessary
		ImageB.displayImage(); // loading unnecessary
		ImageA.displayImage(); // loading unnecessary

	}

}
