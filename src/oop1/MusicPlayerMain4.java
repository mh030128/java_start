package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {

        /*
        객체지향 프로그래밍
         */

        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();

        // 볼륨 증가
        musicPlayer.volumeUp();

        // 볼륨 증가
        musicPlayer.volumeUp();

        // 볼륨 감소
        musicPlayer.volumeDown();

        // 음악 플레이어 상태
        musicPlayer.showStatus();

        // 음악 플레이어 끄기
        musicPlayer.off();
    }
}
