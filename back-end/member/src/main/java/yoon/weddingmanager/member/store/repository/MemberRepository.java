package yoon.weddingmanager.member.store.repository;

import yoon.weddingmanager.member.service.dto.MemberDTO;
import yoon.weddingmanager.member.store.jpo.Member;

public interface MemberRepository {
    String saveMember(MemberDTO member);
    MemberDTO retrieveMember(String id);
}
