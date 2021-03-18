import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ArrayTest1 {
    public static  void main(String[] args) {
        ArrayTest1 arrayTest1 = new ArrayTest1();
        int[]arr=new int[]{1,2,3,4,5,6,7,8,9};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];//arr.length是数组元素的个数：9个，但是注意arr是从0开始的，所以要减去1。
        arr[arr.length-i-1]=temp;
        }
       /*方法二： for(int i=0,j=arr.length-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        */
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        int dest = 0;
        boolean isFlag=true;
        System.out.println();
        System.out.println("输入你要查询的数字");
        dest = arrayTest1.readNumber(dest);
//        System.out.println(dest);
        for (int i=0;i<arr.length;i++){
            if (dest == arr[i]) {
                System.out.println("找到该元素位置为：" +i);
                isFlag=false;
                break;
            }
        }
        if (isFlag){
            System.out.println("未找到！");
        }
    }
    public int readNumber(int n) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        return n;
    }
}

