public class FizzBuzz {

    public String FizzBuzz(int num){
        String result = "";

        for(int i =1; i<=num ; i++){
            if((i%3 == 0) && (i%5 == 0) ){
                result += "FizzBuzz";
            } else if (i%5 == 0){
                result += "Buzz";
            } else if (i%3 == 0){
                result += "Fizz";
            }else {
                result += Integer.toString(i);
            }
            result += "\n";
        }

        return result;
    }
}
