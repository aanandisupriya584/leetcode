//https://leetcode.com/problems/first-bad-version/submissions/883136549/?envType=study-plan&id=algorithm-i
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start=1;
        int end=n;
        
     
      while(start<end){
         int mid=start+(end-start)/2;

          if(isBadVersion(mid)){
             end=mid;
          }
          else{
              start=mid+1;  
          }
          }
      
      return end;
