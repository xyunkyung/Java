package package2;

public class DmbCellphoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DmbCellphone dmb = new DmbCellphone("������12pro", "�۽��Ⱥ��", 5);
		System.out.println(dmb.model);
		System.out.println(dmb.color);
		System.out.println(dmb.channel);
		
		// �θ�κ��� ��� ���� �޼ҵ� ���
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������.");
		dmb.receiveVoice("������ �ڵ��� �³���?");
		dmb.sendVoice("��. �½��ϴ�.");
		dmb.hangUp();
		
		// �ڽ� Ŭ���� �޼ҵ� ����
		dmb.turnOnDmb();
		dmb.changeChannelDmb(11);
		dmb.turnOffDmb();
	}

}
