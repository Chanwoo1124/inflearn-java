package zaccess.b;

public class MaxCount {
    private int count;
    private int max;

    public MaxCount(int max){
        this.max = max;
    }
    public void increment(){
        if (i()){
            count += 1;
        }else {
            System.out.println("초과");
        }
    }
    public void getCount(){
        System.out.println(count);
    }

    private boolean i(){
        return count < max;
    }





}

