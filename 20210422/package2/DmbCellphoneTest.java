package package2;

public class DmbCellphoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DmbCellphone dmb = new DmbCellphone("아이폰12pro", "퍼시픽블루", 5);
		System.out.println(dmb.model);
		System.out.println(dmb.color);
		System.out.println(dmb.channel);
		
		// 부모로부터 상속 받은 메소드 사용
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요.");
		dmb.receiveVoice("이현경 핸드폰 맞나요?");
		dmb.sendVoice("네. 맞습니다.");
		dmb.hangUp();
		
		// 자식 클래스 메소드 실행
		dmb.turnOnDmb();
		dmb.changeChannelDmb(11);
		dmb.turnOffDmb();
	}

}
