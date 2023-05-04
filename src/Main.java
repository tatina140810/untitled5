public class Main {
    public static void makeTea(){
        // метод
        System.out.println("вскипятить воду");
        System.out.println("насыпать заварку");
        System.out.println("залить кипятком");
    }
    public static void main(String[] args) {
        System.out.println("Завтрак");
        makeTea();
        System.out.println("Обед");
        makeTea();
        System.out.println("Ужин");
        addition(4,3,"hello");
        multiply(2,3)}
    //сигнатура метода (все то что до тела)
    public static void addition(int num1,int num2,String word) {//не возвращаемый метод с входящими параметрами
        System.out.println(num1+num2);
        System.out.println(word);
       }
        public static void test() { //не возвращаемый метод без входящих параметров
        int number=8/2;
        int result=number+1*4;
        System.out.println(result);

    }
    public static int multiply (int num1, int num2) {
        return num1*num2;
    }

}