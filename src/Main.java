import Controller.NetworkController;
import Model.Network;
import View.NetworkView;

public class Main
{
	public static void main(String[] args)
	{
		Network network = new Network("192.168.1.1","255.255.0.0","8.8.8.8", "192.168.0.1");
		NetworkView networkView = new NetworkView();
		NetworkController networkController = new NetworkController(network, networkView);
		
		networkController.display_network_info();
		
		networkController.release();
		networkController.renew("192.168.10.2","255.255.255.0","192.168.10.1");
		networkController.display_network_info();
		
		networkController.flush_dns();
		networkController.renew_dns("1.1.1.1");
		networkController.display_network_info();
		
	}
}