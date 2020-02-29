/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testta;

/**
 *
 * @author asish
 */
public class Lambda {
    public static void main(String st[]){
        int[] nums = {2,2,4,2,3,3,3};
//         int ones = 0, twos = 0, threes;
//        for(int i = 0; i < nums.length; i++) {
//            int t = nums[i];
//            twos |= ones & t;
//            ones ^= t;
//            threes = ones & twos;
//            
//            ones &= ~threes;
//            twos &= ~threes;
//        }


int result = 0;
        
        int i, j;
        for(i=0; i<32; i++)
        {
            int cnt=0;    
            for(j=0; j<nums.length; j++)
            {
                cnt+= 1&(nums[j]>>i);
            }
            if(cnt%3!=0)
            {
                    result=result|(1<<i);
            }
        }    
        
        
    //    return result;
        
        System.out.println("==="+result);
    }
}
