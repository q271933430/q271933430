public class YangHuiTriangle {
    public static void main(String[] args) {
        int[][]yangHui=new int[10][];
        for(int i=0;i<yangHui.length;i++){
            yangHui[i]=new int[i+1];//第一行有一个元素；第二行有两个；以此类推。
            yangHui[i][0]=yangHui[i][i]=1;
            if(i>1){
                for (int j=1;j<yangHui[i].length-1;j++){
                    yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
                }
            }
        }
      for (int i=0;i<yangHui.length;i++){
            for (int j=0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+" ");
            }//遍历二维数组
            System.out.println();

        }
    }
}
