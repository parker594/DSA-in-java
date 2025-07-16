import java.util.*;
 public class mp {
//    public static boolean staircase(int matrix[][], int key){
//     int row =0,col=matrix[0].length -1 ;
//     while(row<matrix.length && col >=0){
//         if(matrix[row][col]==key){
//             System.out.print("your ke7y at("+row+","+col+")");
//             return true;
//         }
//         else if(key<matrix[row][col]){
// col--;
//         }
//         else{
//             row++;
//         }
//     }
//     System.out.print("your key is not found");
//     return false ;
//    }
// -------------------------------------------------------------------------------------
//    public static boolean staircasecol(int matrix[][], int key){
//     int col =0,row=matrix[0].length -1 ;
//     while(col<matrix.length && row>=0){
//         if(matrix[row][col]==key){
//             System.out.print("your ke7y at("+row+","+col+")");
//             return true;
//         }
//         else if(key<matrix[row][col]){
// row--;
//         }
//         else{
//             col++;
//         }
//     }
//     System.out.print("your key is not found");
//     return false ;
//    }
//    oits go left to right
//-------------------------------------------------------------------------------------
// public static float shortest(String path){
//     int x=0;
//     int y=0;
//     for(int i =0;i<path.length();i++){
//         char dir=path.charAt(i);
//         if(dir=='w'){
//             x--;

//         }
//         if(dir=='e'){
//             x++;
//         }
//         else if(dir=='n'){
//             y++;
//         }
//         else if(dir=='s'){
//             y--;
//         }
//         // else{
//         //     System.out.print("this variable not showing any direction");
//         // }
//     }
//     int Y2=y*y;
//     int X2=x*x;
//     return (float)Math.sqrt(X2+Y2);

// }
//-----------------------------------------------
// public static String subs(String path,int sr,int er){
//      String substring ="";
//     for(int i =sr;i<er;i++){
//         substring+=path.charAt(i);
//     }
//     return substring; String path="hello world";
    //  System.out.println(path.substring(0,6));  its a alternative way to find substring youcan say its a method just a single line in ,main function
    //  System.out.print(subs(path,0,7));
          
// }
//------------------------------------------------------------------------------------------------------------------------------
// public static String compress(String str){
//     StringBuilder newstr=new StringBuilder("");
//     for(int i=0;i<str.length();i++){
//         Integer count=1;
//         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//             count++;
//             i++;
//         }
        
//         newstr.append(str.charAt(i));
//         if(count>1){
//             newstr.append(count);
//         }
//     }
// return newstr.toString();
// }
// --------------------------------------------------------------------------------------
        public static void main(String args[]) {
    String str ="aaabbbccddd";
    System.out.println((str));
        }
    }
