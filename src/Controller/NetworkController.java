package Controller;

import Model.Network;
import View.NetworkView;

public class NetworkController
{
	private Network net;
	private NetworkView net_view;
	
	public NetworkController(Network network, NetworkView network_view)
	{
		this.net = network;
		this.net_view = network_view;
	}
	
	public void release()
	{
		net.setIP_Address("0.0.0.0");
		net.setNet_Mask("0.0.0.0");
		net.setDefault_Gateway("255.255.255.255");
	}
	
	public void renew(String ip, String net_mask, String gateway)
	{
		net.setIP_Address(ip);
		net.setNet_Mask(net_mask);
		net.setDefault_Gateway(gateway);
	}
	
	public void flush_dns()
	{
		net.setDNS_Server("0.0.0.0");
	}
	
	public void renew_dns(String dns)
	{
		net.setDNS_Server(dns);
	}
	
	public void display_network_info()
	{
		net_view.NetworkInformation(net.getIP_Address(), net.getNet_Mask(), net.getDNS_Server(), net.getDefault_Gateway());
	}
}
