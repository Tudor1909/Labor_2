package View;

public class NetworkView
{
	public NetworkView()
	{}
	
	public void NetworkInformation(String ip, String netmask, String dns, String gateway)
	{
		System.out.printf("Local Host:\nIP Address: %s\nSubnet Mask: %s\nDNS Server: %s\nDefault Gateway: %s%n", ip, netmask, dns, gateway);
	}
}
