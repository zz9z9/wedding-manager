package yoon.weddingmanager.member.service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yoon.weddingmanager.member.domain.logic.spec.MemberService;
import yoon.weddingmanager.member.service.dto.MemberDTO;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public String signup(@RequestBody MemberDTO memberDTO) {
        return memberService.signup(memberDTO);
    }
}
