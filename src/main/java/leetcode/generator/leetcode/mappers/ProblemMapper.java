package leetcode.generator.leetcode.mappers;

import leetcode.generator.leetcode.dtos.ProblemResponseDto;
import leetcode.generator.leetcode.entities.Problem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProblemMapper {

    ProblemResponseDto entityToDto(Problem problem);
}
