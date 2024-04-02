package leetcode.generator.leetcode.services.impl;

import leetcode.generator.leetcode.dtos.ProblemRequestDto;
import leetcode.generator.leetcode.dtos.ProblemResponseDto;
import leetcode.generator.leetcode.entities.Problem;
import leetcode.generator.leetcode.mappers.ProblemMapper;
import leetcode.generator.leetcode.repositories.ProblemRepository;
import leetcode.generator.leetcode.services.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProblemServiceImpl implements ProblemService {

    private final ProblemRepository problemRepository;
    private final ProblemMapper problemMapper;
    private final ChatClient chatClient;

    @Override
    public ProblemResponseDto generateProblem(ProblemRequestDto problemRequestDto) {
        String problemStatement = chatClient.call(problemRequestDto.getMessage());
        String cleanedStatement = problemStatement.replaceAll("\\r?\\n|\\r", " ").replaceAll("\\s+", " ").trim();

        Problem problem = new Problem();
        problem.setStatement(cleanedStatement);

        Problem savedProblem = problemRepository.save(problem);
        return problemMapper.entityToDto(savedProblem);
    }
}
