public class soru1 {
    public static void main(String[] args) {
        String[] am={"star","pie","jelly bean","car"};
        String[ ] bam={"cookie","fig","bannana","soda"};
        for(String st:longArray(am, bam)){
            System.out.println(st);
        }


        
    }
    public static String[] longArray(String[] arr1,String[] arr2){
        
        int counter=arr1.length; 
        int big=arr2.length;
        if(arr2.length<counter){
            counter=arr2.length;
            big=arr1.length;
        }
        String[] arr3=new String[big];
       
        for (int i = 0; i < counter; i++) {
            int res;
            if (arr1[i].compareTo(arr2[i]) < 0) {
                arr3[i] = arr2[i];
            }
            else{
                arr3[i]=arr1[i];
            }
        }
        for(int i=0;i<big-counter;i++){
            arr3[i]="oops";
        }

        return arr3;
        
    }
}
