package org.zerock.mreview.repository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.zerock.mreview.entity.Member;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertMembers() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Member member = Member.builder()
                    .email("r" + i + "@zerock.org")
                    .pw("1111")
                    .nickname("reviewer" + i)
                    .build();

            memberRepository.save(member);
        });
    }

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    @Commit
    @Transactional
    public void testDelete() {
        Long mid = 1L;

        Member member = Member.builder().mid(mid).build();

        memberRepository.deleteById(mid);
        reviewRepository.deleteByMember(member);
    }
}
