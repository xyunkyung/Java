package package2;

public class DmbCellphone extends Cellphone {

	int channel;
	
	DmbCellphone(String model, String color, int channel) {	// default
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 입니다.");
	}
	void changeChannelDmb(int channel) {	// protected
		this.channel = channel;
		System.out.println("채널 " + channel + "번 입니다.");
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
