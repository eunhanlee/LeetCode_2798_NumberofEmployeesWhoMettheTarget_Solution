import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void SolutionTest() {
        Solution solution = new Solution();

        int[] hours1 = { 8, 8, 8, 8, 8 };
        int target1 = 8;
        int expected1 = 5;
        int actual1 = solution.numberOfEmployeesWhoMetTarget(hours1, target1);
        assertEquals(expected1, actual1);

        int[] hours2 = { 6, 5, 4, 3 };
        int target2 = 7;
        int expected2 = 0;
        int actual2 = solution.numberOfEmployeesWhoMetTarget(hours2, target2);
        assertEquals(expected2, actual2);

        int[] hours3 = { 7, 6, 9, 10, 8 };
        int target3 = 7;
        int expected3 = 4;
        int actual3 = solution.numberOfEmployeesWhoMetTarget(hours3, target3);
        assertEquals(expected3, actual3);

        int[] hours4 = { 2, 0, 3, 1, 0 };
        int target4 = 0;
        int expected4 = 5;
        int actual4 = solution.numberOfEmployeesWhoMetTarget(hours4, target4);
        assertEquals(expected4, actual4);

        int[] hours5 = { 9, 8, 10, 12, 11 };
        int target5 = 7;
        int expected5 = 5;
        int actual5 = solution.numberOfEmployeesWhoMetTarget(hours5, target5);
        assertEquals(expected5, actual5);

        int[] hours6 = {};
        int target6 = 5;
        int expected6 = 0;
        int actual6 = solution.numberOfEmployeesWhoMetTarget(hours6, target6);
        assertEquals(expected6, actual6);

        int[] hours7 = { 2, 3, 1, 4, 5 };
        int target7 = -1;
        int expected7 = 5;
        int actual7 = solution.numberOfEmployeesWhoMetTarget(hours7, target7);
        assertEquals(expected7, actual7);

        int[] hours8 = { 10, 8, 12, 15, 9, 10, 11, 13, 14, 9, 8, 12, 11, 10 };
        int target8 = 11;
        int expected8 = 7;
        int actual8 = solution.numberOfEmployeesWhoMetTarget(hours8, target8);
        assertEquals(expected8, actual8);

        int[] hours9 = { -4, -5, -6, -3, -2 };
        int target9 = -6;
        int expected9 = 5;
        int actual9 = solution.numberOfEmployeesWhoMetTarget(hours9, target9);
        assertEquals(expected9, actual9);

        int[] hours10 = { 7 };
        int target10 = 7;
        int expected10 = 1;
        int actual10 = solution.numberOfEmployeesWhoMetTarget(hours10, target10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
