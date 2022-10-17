public class MainFunctionLessons6 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 5, 75, 35, 3, 1, 0, 5, 43, 6};
        int max=getMaxFromArray(arr);
        System.out.println("Array max =" + max);


        int []arr1= {3,5,9};
        max= getMaxFromArray(arr1);
        System.out.println ("Array 2 max =" + max);



    }
    public static int getMaxFromArray (int [] array){
        int a = array [0];
        for(int v:array){
            if (v>a){
                a=v;
            }
        }
        return a;
    }
}











