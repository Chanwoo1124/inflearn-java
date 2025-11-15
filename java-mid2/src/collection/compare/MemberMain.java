package collection.compare;


import java.util.Arrays;

public class MemberMain {
    public static void main(String[] args) {
        Member 정우영 = new Member("정우영", 27);
        Member 이찬우 = new Member("이찬우", 25);
        Member 김민규 = new Member("김민규", 26);

        Member[] members = {정우영,이찬우,김민규};

        Arrays.sort(members);
        System.out.println(Arrays.toString(members));

        Arrays.sort(members, new IdComparator());
        System.out.println(Arrays.toString(members));

        Arrays.sort(members,new IdComparator().reversed());
        System.out.println(Arrays.toString(members));

    }
}
