public class Triangle {

    public String easyExercise() {
        return "*";
    }

    public String horizontalLine(int num) {
        String result = "";
        for(int i=0; i< num ; i++){
            result += "*";
        }
        return result;
    }

    public String verticalLine(int num) {
        String result = "";
        for(int i=0; i< num ; i++){
            result += "*\n";
        }
        return result;
    }

    public String buildTriangle(int num){
        String result = "";
        for(int i=0; i<num; i++){
            result += stringBuilder(i + 1);
            result += "\n";
        }

        return result;
    }

    public String stringBuilder(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num ; i++){
            sb.append("*");
        }
        return sb.toString();

    }

}
