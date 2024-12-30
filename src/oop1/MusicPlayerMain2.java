package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        /*
        절차지향 프로그래밍
        - 음악 플레이어와 관련된 데이터는 MusicPlayerData 클래스에 존재.
        - 프로그램 로직이 복잡해져서 다양한 변수들이 추가되어도 음악 플레이어와 관련된 변수들은
          MusicPlayerData data 객체에 속해있으므로 쉽게 구분 가능.
         */

        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
