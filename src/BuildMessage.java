import java.util.*;
public class BuildMessage{ /*{
    public static void main(String[] args) {
        var pair = readInput();
        String message = pair.getFirst();
        int k = pair.getSecond();
        String result = "";
        if(k>0)
        {
            for(int i = 0; i< k; i++) {
                result += message;
            }
        }
        if(k<0)
        {
if(message.length()%k ==0)
    me
        }

        System.out.println(result);*/

        public static void main(String[] args) {
          //  Pair<Integer, List<Integer>> input = readInput();
         //   int n = input.getFirst();
        //    List<Integer> data = input.getSecond();
           // String result = copyItems(n, data);
          //  System.out.println(result);
        }

       /* public static String copyItems(int n, List<Integer> items) {
            for(int i = 0; i<n; i++)
            {
               // items
            }*/


    public static Pair<String, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        String message = input[0];
        int k = Integer.parseInt(input[1]);
        return new Pair<>(message, k);
    }
}
