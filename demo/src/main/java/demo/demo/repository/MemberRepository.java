package demo.demo.repository;

import demo.demo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("memberRepository")
public interface MemberRepository 
       extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}