package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        /*
        절차지향 프로그래밍_메서드추출
        - 각각의 기능이 모듈화 되었음.
            - 중복 제거 : 해당 메서드를 여러번 호출하면 됨.
            - 변경 영향 범위 : 기능 수정할 때 해당 메서드 내부만 변경하면 됨.
            - 메서드 이름 추가 : 메서드 이름 통해 코드를 더 쉽게 이해 가능.
         */

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
