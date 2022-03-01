public class Method {
    public static void main(String[] args) {
        hello();
        printname("Liuda");

        //Вычислим площадь круга
        double area;
        area = calcCircleArea(1);
        System.out.println(area); //Можно и нужно этот код писать по другому

        System.out.println(calcCircleArea(1));

        System.out.println(sum(1,2));
    }
    static void hello(){
        System.out.println("hello");
    }
    static void printname(String name){
        System.out.println(name);
    }
    static double calcCircleArea(double r){
        double area = Math.PI*r*r;
        return area;
    }
    //Метод, который складывает два значения и возвращает сумму
    static int sum(int a, int b){
        return a+b;
    }

}
