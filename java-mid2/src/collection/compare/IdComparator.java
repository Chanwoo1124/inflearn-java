package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
