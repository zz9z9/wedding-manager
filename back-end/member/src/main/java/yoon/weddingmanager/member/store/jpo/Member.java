package yoon.weddingmanager.member.store.jpo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import yoon.weddingmanager.member.service.dto.Gender;
import yoon.weddingmanager.member.service.dto.MemberDTO;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Member {
    private String id;
    private String password;
    private String memberName;
    private Gender gender;
    private String weddingDate;
    private int planBudget;

    public Member(String id, String password, String memberName, Gender gender) {
        this.id = id;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
    }

    public MemberDTO convertToDTO() {
           return MemberDTO.builder()
                   .id(this.getId())
                   .build();
    }
}
