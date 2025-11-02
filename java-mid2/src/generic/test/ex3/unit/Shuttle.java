package generic.test.ex3.unit;

public class Shuttle <T extends BioUnit>{
    private T unit;


    public void in(T unit){
        this.unit = unit;
    }

    public void showInfo(){
        System.out.println(unit.getName());
        System.out.println(unit.getHp());

    }

    public T out() {
        return unit;
    }
}
