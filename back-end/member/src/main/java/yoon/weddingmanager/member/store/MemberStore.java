package yoon.weddingmanager.member.store;

import org.springframework.stereotype.Repository;
import yoon.weddingmanager.member.service.dto.MemberDTO;
import yoon.weddingmanager.member.store.jpo.Member;
import yoon.weddingmanager.member.store.repository.MemberRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemberStore implements MemberRepository {
    static private Map<String, Member> db = new HashMap<>();

    @Override
    public String saveMember(MemberDTO memberDTO) {
        Member saveMem = memberDTO.convertToJpo();
        if(retrieveMember(saveMem.getId())!=null) {
            throw new IllegalArgumentException("이미 존재하는 회원입니다!");
        }

        db.put(saveMem.getId(), saveMem);
        return saveMem.getId();
    }

    @Override
    public MemberDTO retrieveMember(String id) {
        return Optional.ofNullable(db.get(id))
                .map(Member::convertToDTO)
                .orElse(null);
    }
}
