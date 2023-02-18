public class Calculator {
    int fnum;
    int snum;
    public Calculator(){

    }
    public Calculator(int fnum, int snum){
        this.fnum= fnum;
        this.snum = snum;
    }
    public int Add() throws ArithmeticException{
        if(fnum <0 || snum <0){
            throw new ArithmeticException("One of the number is negative");
        }
        return fnum + snum;
    }
    public int Subtract() throws ArithmeticException{
        if(fnum <0 || snum <0){
            throw new ArithmeticException("One of the number is negative");
        }
        return fnum - snum;
    }
    public int Multiplication() throws ArithmeticException{
        if(fnum == 0 || snum == 0){
            throw new ArithmeticException("Your number should not be a zero");
        }
        return fnum * snum;
    }
    public int Division() throws ArithmeticException{
        if(fnum == 0 || snum == 0){
            throw new ArithmeticException("Your number should not be a zero");
        }
        return fnum / snum;
    }
}
