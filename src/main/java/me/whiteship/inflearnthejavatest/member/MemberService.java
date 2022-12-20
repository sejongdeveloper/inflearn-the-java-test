package me.whiteship.inflearnthejavatest.member;

import me.whiteship.inflearnthejavatest.domain.Member;
import org.springframework.jmx.export.metadata.InvalidMetadataException;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId);
}
