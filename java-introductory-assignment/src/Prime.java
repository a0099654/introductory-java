import java.util.ArrayList;

public class Prime {

    public ArrayList<Integer> getPrimeNumber(int num){
        ArrayList<Integer> result = new ArrayList<>();

        int value = num;

        for(int i=2; i<=num; i++){
            if(value % i == 0){
                result.add(i);
                value /= i;
            }
        }

        return result;
    }
}
