import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] row = {0,2,1,3};
        int expected = 1;
        int actual = new Solution().minSwapsCouples(row);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] row = {3,2,0,1};
        int expected = 0;
        int actual = new Solution().minSwapsCouples(row);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] row = {0,2,4,6,7,1,3,5};
        int expected = 3;
        int actual = new Solution().minSwapsCouples(row);
        Assert.assertEquals(expected, actual);
    }
}
