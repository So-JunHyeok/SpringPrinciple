package hello.core.member;

// 구현체가 하나만 있다면 관례적으로 Imp를 사용함
public class MemberServiceImp implements MemberService {

    // 실제 할당하는 부분이 구현체를 의존함
    // 추상화 구체화에 모두 의존함
    // DIP 위반
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
