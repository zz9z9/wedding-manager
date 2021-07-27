package yoon.weddingmanager.member.domain.logic.impl;

import org.springframework.stereotype.Service;
import yoon.weddingmanager.member.domain.logic.spec.MemberService;
import yoon.weddingmanager.member.service.dto.MemberDTO;
import yoon.weddingmanager.member.store.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String signup(MemberDTO member) {
        return memberRepository.saveMember(member);
    }

    @Override
    public MemberDTO findMember(String id) {
        return memberRepository.retrieveMember(id);
    }
}
