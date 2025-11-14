package collection.Map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MemberRepository {
    private HashMap<String,Member> memberHashMap = new HashMap<>();

    public void save(Member member){
        String id = member.getId();
        memberHashMap.put(id,member);
    }
    public void remove(String id){
        memberHashMap.remove(id);

    }
    public Member findById(String id){
        Member member = memberHashMap.get(id);
        return member;
    }

    public Member findByName(String name){
        for (Map.Entry<String, Member> stringMemberEntry : memberHashMap.entrySet()) {
            if(stringMemberEntry.getValue().getName().equals(name)){
                return stringMemberEntry.getValue();
            }
        }
        return null;
    }

}
