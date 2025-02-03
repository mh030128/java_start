package access;

public class Speaker {

    /*
    private 접근제어자를 사용함으로써
    내부 클래스에서는 사용가능하고, 외부에서는 사용 불가능.
     */
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("용량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
