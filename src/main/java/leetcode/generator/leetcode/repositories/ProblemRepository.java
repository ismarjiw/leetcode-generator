package leetcode.generator.leetcode.repositories;

import leetcode.generator.leetcode.entities.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Long> {
}
