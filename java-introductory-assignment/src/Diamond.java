public class Diamond {

    public String makeIsoscelesTriangle(int num){
        String result = "";

        for(int i=1; i<=num; i++){

            int space = num - i;
            result += createSpace(space);

            int noOfAsterisks = (i-1) + (i);
            result += horizontalLine(noOfAsterisks);
        }

        return result;
    }

    public String horizontalLine(int num){
        String result = "";
        for(int i=0; i< num ; i++){
            result += "*";
        }
        result += "\n";
        return result;
    }

    public String createSpace(int num){
        String result = "";
        for(int i=0; i<num ; i++){
            result += " ";
        }
        return result;
    }

    public String reverseString(int num){

        String result = "";
        result += makeIsoscelesTriangle(num);
        result += reverseTriangle(num, 1);
        return result;
    }

    public String reverseTriangle(int num, int space){
        String result = "";

        for(int i=num-1; i>0; i-=1){

            result += createSpace(space);
            space += 1;
            int noOfAsterisks = (i * 2) - 1;
            result += horizontalLine(noOfAsterisks);

        }
        return result;

    }

    public String placeStringMiddle( int num ){

        String result = "";
        result += makeIsoscelesTriangle(num - 1);

        result += "Stella \n";

        result += reverseTriangle(num, 0);

        return result;
    }
}
