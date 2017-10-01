public class DiamondTestDrive {

    public static void main (String[] args){
        Diamond diamond = new Diamond();

        System.out.println("Isosceles Triangle");
        System.out.println(diamond.makeIsoscelesTriangle(3));

        System.out.println("Diamond");
        System.out.println(diamond.reverseString(3));

        System.out.println("Diamond with name");
        System.out.println(diamond.placeStringMiddle(3));
    }
}
