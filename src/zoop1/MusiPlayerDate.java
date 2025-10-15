package zoop1;

public class MusiPlayerDate {
    int sound = 0;
    boolean b = false;


    public void soundup(){
        sound++;
        System.out.println("사운드 증가"+ sound);
    }
    public void sounddown(){
        sound--;
        System.out.println("사운드 감소"+ sound);
    }

    public void on(){
        b = true;
    }
    public void off(){
        b = false;
    }

}
