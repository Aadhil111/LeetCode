class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merge = new int[nums1.length+nums2.length];

        int i=0,j=0,index=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) merge[index++]=nums1[i++];
            else merge[index++]=nums2[j++];
        }
        if(i!=nums1.length){
            while(i<nums1.length) merge[index++]=nums1[i++];
        }
        if(j!=nums2.length){
            while(j<nums2.length) merge[index++]=nums2[j++];
        }

        double median=0;
        if((merge.length & 1)==1){
            median = merge[merge.length/2] ;
        } 
        else {
            double temp1=merge[merge.length/2];
            double temp2=merge[(merge.length/2)-1];
            median=(temp1+temp2)/2;
        }
       
        return median;        
    }
}