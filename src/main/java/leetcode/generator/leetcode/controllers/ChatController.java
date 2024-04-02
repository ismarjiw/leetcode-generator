package leetcode.generator.leetcode.controllers;

import leetcode.generator.leetcode.dtos.ProblemRequestDto;
import leetcode.generator.leetcode.dtos.ProblemResponseDto;
import leetcode.generator.leetcode.services.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/problems")
public class ChatController {

    private final ProblemService problemService;

    @PostMapping
    public ProblemResponseDto generate(
            @RequestBody ProblemRequestDto problemRequestDto
    ) {
        return problemService.generateProblem(problemRequestDto);
    }
}
