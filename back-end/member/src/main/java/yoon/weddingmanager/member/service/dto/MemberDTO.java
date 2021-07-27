package yoon.weddingmanager.member.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import yoon.weddingmanager.member.store.jpo.Member;

@AllArgsConstructor
@Getter
@Setter
public class MemberDTO {
    private String id;
    private String password;
    private String memberName;
    private Gender gender;
    private String weddingDate;
    private int planBudget;


    @Builder
    public MemberDTO(String id, String password, String memberName, Gender gender) {
        this.id = id;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
    }

    public Member convertToJpo() {
        return Member.builder()
                .id(this.getId())
                .password(this.getPassword())
                .memberName(this.getMemberName())
                .gender(this.getGender())
                .weddingDate(this.getWeddingDate())
                .planBudget(this.getPlanBudget())
                .build();
    }
}
