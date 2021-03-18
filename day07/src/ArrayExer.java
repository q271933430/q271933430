public class ArrayExer {
    public static void main(String[] args) {
        int[]array1,array2;//创建两个数组
        array1=new int[]{2,3,5,7,11,13,17,19};
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
        System.out.println(" ");
        array2=array1;//把array1的地址给了array2
        for (int i=0;i<array2.length;i++){
            if (i%2==0){
                array2[i]=i;
            }
        }
        for (int i=0;i<array1.length;i++) {
            System.out.print(array1[i]+"\t");
        }
    }
}
