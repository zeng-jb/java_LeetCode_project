import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1455 lang=java
 *
 * [1455] 检查单词是否为句中其他单词的前缀
 */

// @lc code=start
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if( str[i].indexOf(searchWord) == 0){
                return i+1;
            }
        }
        return -1;
    }






    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = Arrays.stream(energy).sum();
        int countday = 0;
        if(sum >= initialEnergy){
            countday = sum - initialEnergy + 1;
        }

        for(int i=0;i<experience.length;i++){
            if(initialExperience > experience[i]){
                initialExperience += experience[i];
            }else{
                int count = experience[i] - initialExperience + 1;
                countday += count;
                initialExperience += count + experience[i];
            }
        }
        return countday;
    }


}
// @lc code=end

