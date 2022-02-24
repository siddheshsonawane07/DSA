package Recursion;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class BS_Recursion_Rotated_Array {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = BS(nums,start,end,target);
        return ans;

    }
    public static int BS(int [] nums, int start, int end, int target){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid]== target){
                return mid;
            }

            //if left array is sorted
            if(nums[start] <= nums[mid]){

                if(target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            //if right array is sorted
            else{
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {



        }


    }
