package lab_5_tasks;/*Create a class having 4 functions, add, sub, mul and div. Each function accepts 2 parameters and returns
the sum, difference, multiplication and division of these numbers.Create a main class having main function that uses the above class.*/

class Calc{
    private float result;
    float add(float x , float y){
        result = x + y;
        return result;
    }
    float sub(float x , float y){
        result = x - y;
        return result;
    }
    float multi(float x , float y){
        result = x * y;
        return result;
    }
    float div(float x , float y){
        result = x / y;
        return result;
    }
}

public class task1 {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        System.out.println(c1.add(2 , 3));
        System.out.println(c1.sub(2 , 3));
        System.out.println(c1.multi(2 , 3));
        System.out.println(c1.div(2 , 3));
    }
}
