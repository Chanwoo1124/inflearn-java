package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
        //Class clazz1 = new String().getClass();
        //Class clazz2 = Class.forName("java.lang.String");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

    }
}
