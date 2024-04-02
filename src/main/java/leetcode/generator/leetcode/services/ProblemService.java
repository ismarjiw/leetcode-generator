package leetcode.generator.leetcode.services;

import leetcode.generator.leetcode.dtos.ProblemRequestDto;
import leetcode.generator.leetcode.dtos.ProblemResponseDto;


public interface ProblemService {

    ProblemResponseDto generateProblem(ProblemRequestDto problemRequestDto);
}
