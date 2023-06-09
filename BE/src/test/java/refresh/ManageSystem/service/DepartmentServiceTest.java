package refresh.ManageSystem.service;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Daniel Kim
 *
 * 부서 정보를 가져오는 테스트 클래스
 *
 * 2023-04-28
 */
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    /**
     * Daniel Kim
     *
     * 회원 ID를 통해 부서 이름을 가져오는 테스트
     * NonNull, Null 테스트
     *
     * 2023-04-29
     */
    @Test
    void 회원_ID_부서_이름_찾기() {
        // 존재하지 않는 id로 조회했을 때 Optional 객체가 비었는지 확인
        Optional<String> member1 = departmentService.getDepartmentNameById("mem");
        Assertions.assertThat(member1).isEmpty();
        System.out.println(member1);
        // 존재하는 id로 조회했을 때 부서를 잘 가져오는지 확인
        Optional<String> member2 = departmentService.getDepartmentNameById("admin");
        Assertions.assertThat(member2).isEqualTo(Optional.of("개발팀"));
        System.out.println(member1);

    }
    /**
     * Daniel Kim
     *
     * 회원 ID를 통해 부서의 총 사원 수를 가져오는 테스트
     * NonNull, Null 테스트
     *
     * 2023-04-29
     */
    @Test
    void 회원_ID_부서_사원수_찾기() {
        // 존재하는 회원으로 조회했을 때 부서 사원수를 잘 가져오는지 확인
        Optional<Integer> t1 = departmentService.getDepartmentTotalById("admin");
        Assertions.assertThat(t1).isNotEmpty();
        // 존재하지 않는 id로 조회했을 때 Optional 객체가 비었는지 확인
        Optional<Integer> t2 = departmentService.getDepartmentTotalById("star");
        Assertions.assertThat(t2).isEmpty();
    }

    /**
     * Daniel Kim
     *
     * 모든 부서 가져오기
     *
     * 2023-05-01
     */
    @Test
    void 모든_부서_가져오기() {
        List<String> departmentAllList = departmentService.getDepartmentAllList();
        assertThat(departmentAllList.size()).isEqualTo(5);
    }

}