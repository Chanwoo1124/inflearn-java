package zaccess.b;

public class Speaker {
    int volume;

    Speaker(int volume){
        this.volume = volume;
    }
    void volumeup(){
        if (volume >= 100){
            System.out.println("음량 증가 불가");
        }

    }

}
