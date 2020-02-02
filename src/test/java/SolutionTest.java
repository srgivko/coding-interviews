import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void solution() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(3,5,new int[]{2, 1, 3, 1, 2, 2, 3})));
        Solution solution1 = new Solution();
        System.out.println(Arrays.toString(solution1.solution(4, 2, new int[]{1, 2, 2, 1, 2})));
        Solution solution3= new Solution();
        System.out.println(Arrays.toString(solution3.solution(3, 5, new int[]{1, 1, 1, 1, 1, 1})));
    }
}