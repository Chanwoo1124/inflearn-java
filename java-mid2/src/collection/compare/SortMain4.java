package collection.compare;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        Member 정우영 = new Member("정우영", 27);
        Member 이찬우 = new Member("이찬우", 25);
        Member 김민규 = new Member("김민규", 26);

        LinkedList<Member> members = new LinkedList<>();
        members.add(정우영);
        members.add(이찬우);
        members.add(김민규);

        System.out.println(members);

        members.sort(null);
        System.out.println(members);

        members.sort(new IdComparator());
        System.out.println(members);

        Collections.sort(members);
        System.out.println(members);
    }
}
