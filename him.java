import java.util.*;

public class him {

    // public static void update ( int marks[]){
    // for( int i=0;i<marks.length;i++){
    // marks[i]=marks[i]+1 ;
    // }
    // // }
    // psvm()

    // int marks[]={23,34,56};
    // update(marks);
    // for( int i=0;i<marks.length;i++){
    // System.out.print(marks[i]+" ");

    // }
    // ;
    // System.out.println();

    /**
     * // *
     */

    // public static String map( String menue[],String ki){
    // for( int i=0;i<menue.length;i++){
    // if (menue[i]==ki){
    // System.out.print("its",menue[i]);

    // }
    // else{
    // System.out.println("its not found");
    // }
    // }

    // } String menue[]={"mango", "apple","help","aany"};
    // int key=4;
    // String ki="help";
    // int index =map (numbers,key);
    // // if(index ==-1){
    // // System.out.print("its not available ");
    // // }
    // // else{
    // // System.out.println("its" + index);
    // // }
    // System.out.print( "uts"+index);

    // public static int larsmal(int numbers[]){
    // int largest =Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;
    // for ( int i=0;i<numbers.length;i++){
    // if(smallest>numbers[i]){
    // smallest =numbers[i];
    // }
    // }
    // return smallest;

    // }
    // ----------------------------------------------------
    // public static int binary(int numbers[] ,int key){
    // int start =0, end =numbers.length -1 ;
    // while ( start<end){
    // int mid= (start +end)/2;
    // if (numbers[mid]==key){
    // return mid ;
    // }
    // if (numbers[mid] < key){
    // start = mid +1;
    // }
    // else{
    // end=mid-1;
    // }
    // }
    // return -1;
    // }
    // -------------------------------------------------
    // public static void reverse( int num[]){
    // int start=0,end=num.length-1;
    // while ( start <end){
    // int temp = num[end];
    // num[end]=num[start];
    // num[start]=temp;
    // start++;
    // end--;
    // }

    // }
    // reverse(num);
    // for ( int i=0;i<num.length;i++){

    // System.out.print( num[i]+" ");
    // }
    // System.out.println();A
    // ------------------------------------
    // public static void pair(int num[]){
    // for( int i=0; i<num.length;i++){
    // int coup =num[i];
    // for(int j=i+1;j<num.length;j++){
    // // int ripo=num[j];
    // System.out.print( "(" +coup+","+ num[j] +")");
    // }
    // System.out.println();
    // }
    // }
    // --------------------------
    // public static void subarrays(int num[]) {
    // for (int i = 0; i < num.length; i++) {
    // for (int j = i; j < num.length; j++) {
    // for (int k = i; k < j; k++) {
    // System.out.print(num[k] + " ");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }
    // System.out.println();

    // }
    // ---------------------------
//     public static void  maxsubarrays(int num[]) {
//         // int sum = 0;
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i; j < num.length; j++) {
//                int sum=0;
//                 for (int k = i; k < j; k++) {
//                     sum = sum + num[k];
              
                
//                 }  
//                      System.out.print(sum);
//                   if (max < sum) {
//                         max = sum; 
                       
//                     }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.print( " maximum number is"+max);

//     }
// ---------------------------------------------------
// public static int stocks(int prices[] ){
//     int buying =Integer.MAX_VALUE;
//     int maxprofit=0;
//     for( int i=0;i<prices.length;i++){
//         if ( buying<prices[i]){
//             int profit=prices[i]-buying;
//             maxprofit =Math.max(maxprofit,profit);
//         }
//         else{
//             buying=prices[i];
//         }
//     }
//     return maxprofit;
// }

//  ----------------------------------------------------------   
// public static int trapp(int heights[]){
//     int n =heights.length;
//     int left []=new int[n];
//      left[0]=heights[0];
//      for(int i=1;i<n;i++){
// left[i]=Math.max(heights[i],left[i-1]);
//      }
//      int right[]=new int[n];
//      right[n-1]=heights[n-1];
//      for( int i=n-2;i>=0;i--){
//         right[i]=Math.max( heights[i], right[n-1]);
//      }
//      int trapped=0;
//      for(int i=0;i<n;i++){
//      int waterlevel=Math.min(left[i],right[i]);
//      trapped+=waterlevel-heights[i];
     
//      }
// return trapped;
// }
// ---------------------------------------------------------
// public static  void    selection(int heights []){
//      int n  = heights.length;

//      for( int i=0;i<n-1; i++){
//         int minpos=i;
//         for( int j=i+1;j<n;j++){
            
//             if(heights[minpos]>heights[j]){
//                  minpos=j;
//             }
          

//         }
//           int temp=heights[i];
//         heights[i]=heights[minpos];
//         heights[minpos]=temp;
//      }
// // }
// ---------------------------------------------------------



public static void printhe(int heights[]){
    for( int i=0;i<heights.length;i++){
System.out.print(heights[i]+" ");
    }
    System.out.println();
}
    public static void main(String args[]) {

        int heights[]={4,2,0,6,3,2,5};

          
            printhe(heights);
      
    }
}