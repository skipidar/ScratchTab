package icommand.nxt.comm;

class NXTInfo {
	public String name;
	public String btDeviceAddress;
	public String btResourceString;
	public int nxtPtr;
	// ?? NXTCommFactory says 1=USB, 2=BT for protocol
	public int protocol = 0; // 0=URL, 1 = Bluetooth
	
	public NXTInfo() {
		
	}
	
	public NXTInfo(String name, String address) {
		this.name = name;
		this.btDeviceAddress = address;
		this.btResourceString = name + "::" + address;
		this.protocol = NXTCommFactory.BLUETOOTH;
	}
}
