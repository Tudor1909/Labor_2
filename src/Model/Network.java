package Model;

public class Network
{
	private String IP_Address;
	private String Net_Mask;
	private String DNS_Server;
	private String Default_Gateway;
	
	public Network(String ip, String netmask, String dns, String gateway)
	{
		this.IP_Address = ip;
		this.Net_Mask = netmask;
		this.DNS_Server = dns;
		this.Default_Gateway = gateway;
	}
	
	public String getIP_Address()
	{
		return IP_Address;
	}
	
	public void setIP_Address(String IP_Address)
	{
		this.IP_Address = IP_Address;
	}
	
	public String getNet_Mask()
	{
		return Net_Mask;
	}
	
	public void setNet_Mask(String net_Mask)
	{
		Net_Mask = net_Mask;
	}
	
	public String getDNS_Server()
	{
		return DNS_Server;
	}
	
	public void setDNS_Server(String DNS_Server)
	{
		this.DNS_Server = DNS_Server;
	}
	
	public String getDefault_Gateway()
	{
		return Default_Gateway;
	}
	
	public void setDefault_Gateway(String default_Gateway)
	{
		Default_Gateway = default_Gateway;
	}
}
