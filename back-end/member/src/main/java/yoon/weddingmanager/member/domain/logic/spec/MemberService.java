package yoon.weddingmanager.member.domain.logic.spec;

import yoon.weddingmanager.member.service.dto.MemberDTO;

public interface MemberService {
    String signup(MemberDTO member);
    MemberDTO findMember(String id);
}
