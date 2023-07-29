
import java.util.Arrays;
class initial{
    void sort(){
        int[] array=new int[]{2,4,6,7,3,0};
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
public class sort {
    public static void main(String[] args) {
        initial sorta = new initial();
        sorta.sort();
    }
}





