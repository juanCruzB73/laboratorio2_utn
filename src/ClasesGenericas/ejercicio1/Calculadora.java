package ClasesGenericas;

public class Calculadora implements Operaciones<Integer> {

    double num1 ;
    double num2 ;

    public Calculadora(double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;

    };

    @Override
    public Integer suma() {
        System.out.println(num1+num2);
        return null;
    }

    @Override
    public Integer resta() {
        System.out.println(num1-num2);
        return null;
    }

    @Override
    public Integer Division() {
        System.out.println(num1/num2);
        return null;
    }

    @Override
    public Integer producto() {
        System.out.println(num1*num2);
        return null;
    }
}
