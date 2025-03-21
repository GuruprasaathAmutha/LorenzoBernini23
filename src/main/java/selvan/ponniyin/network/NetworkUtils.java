package selvan.ponniyin.network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkUtils {

	public static String getlocalIP() {
		try {
			Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();
			
			while(e.hasMoreElements()) {
				NetworkInterface n = e.nextElement();
				
				if(n.isLoopback() || n.isVirtual()) {
					continue;
				}
				
				Enumeration<InetAddress> add = n.getInetAddresses();
				while(add.hasMoreElements()) {
					InetAddress Iadd = add.nextElement();
					
					
					if(!Iadd.isLoopbackAddress() && Iadd.getHostAddress().matches("\\d+\\.\\d+\\.\\d+\\.\\d+")){
					return Iadd.getHostAddress();	
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "localhost";
	}
}
