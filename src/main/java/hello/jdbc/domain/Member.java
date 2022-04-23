package hello.jdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Member {

    private String memberId;
    private int money;

    public Member() {}

    public Member(String memberId, int money) {
        this.memberId = memberId;
        this.money = money;
    }
}
