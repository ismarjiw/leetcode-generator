package leetcode.generator.leetcode.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemRequestDto {
    private String content;

    public String getMessage() {
        return this.content;
    }
}
