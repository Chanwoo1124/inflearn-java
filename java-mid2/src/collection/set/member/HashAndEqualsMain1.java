package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m1.hashCode() = " + m2.hashCode());

        set.add(m1);
        set.add(m2);

        System.out.println(set);

    }
}
