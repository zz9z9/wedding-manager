package yoon.weddingmanager.member.domain.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yoon.weddingmanager.member.domain.logic.impl.MemberServiceImpl;
import yoon.weddingmanager.member.service.dto.Gender;
import yoon.weddingmanager.member.service.dto.MemberDTO;
import yoon.weddingmanager.member.store.MemberStore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MemberServiceTest {

    private final MemberServiceImpl service = new MemberServiceImpl(new MemberStore());

    @Test
    @DisplayName("신규 회원가입 한 후 조회한다")
    public void signup() {
        MemberDTO newMem = new MemberDTO("id", "1234", "이재윤", Gender.MALE);
        service.signup(newMem);

        MemberDTO findMem = service.findMember(newMem.getId());
        assertThat(findMem.getId()).isEqualTo(newMem.getId());
    }

    @Test
    @DisplayName("기존 회원은 새로 가입할 수 없다")
    public void signupWhenAlreadyExist() {
        MemberDTO newMem = new MemberDTO("samdId", "1234", "이재윤", Gender.MALE);
        service.signup(newMem);

        assertThatThrownBy(() -> service.signup(newMem));
    }
}
