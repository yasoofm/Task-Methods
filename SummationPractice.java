import java.util.ArrayList;
import java.util.List;
public class SummationPractice{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(1,2,3,4,5));
    
        int result = sum(numbers);
        System.out.println(result);
      }
      
      public static int sum(ArrayList<Integer> nums){
        int result = 0;
        for(int num : nums){
          result += num;
        }
        return result;
      }
}
