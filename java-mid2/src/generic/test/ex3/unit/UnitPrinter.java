package generic.test.ex3.unit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t){
        T unit = t.out();
        System.out.println(unit.getName());
        System.out.println(unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit out = shuttle.out();
        System.out.println(out.getName());
        System.out.println(out.getHp());

    }
}
