package msa;

import org.junit.Assert;
import org.junit.Test;

public class MinIndexTest {
    @Test
    public void ifarrey5(){
        MinIndex minIndex =new MinIndex();
        int[]ints =new int[] {2, 1, 0,3,4,5,6};
       int in = minIndex.indexOfMin(0,3,ints);
       int out=2;
        Assert.assertEquals(out,in);
    }
}
