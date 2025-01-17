package JAVA101;
import java.util.Arrays;
public class arrays_ornek3 {
    static boolean isFind(int[] arr,int value){
        for (int i: arr){
            if (i==value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2,3,4,5,6,3,2,2,4,4};
        int[] duplicate = new int[list.length];
        int startindex=0;
        for (int i=0;i<list.length;i++){
            for (int j=0;j< list.length;j++){
                if ((i!=j)&&(list[i]==list[j])){
                    if (!isFind(duplicate,list[i])){
                        duplicate[startindex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value:duplicate){
            if ((value!=0)&&(value%2==0)) {
                System.out.println(value);
            }
        }
    }
}
