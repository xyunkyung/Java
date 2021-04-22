package package2;

public class DmbCellphone extends Cellphone {

	int channel;
	
	DmbCellphone(String model, String color, int channel) {	// default
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	public void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� �Դϴ�.");
	}
	void changeChannelDmb(int channel) {	// protected
		this.channel = channel;
		System.out.println("ä�� " + channel + "�� �Դϴ�.");
	}
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
