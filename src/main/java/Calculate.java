public class Calculate {
    public int calA(int a, int b){
        return a+b;
    }

    public int calS(int a, int b){
        return a-b;
    }

    public int calM(int a, int b){
        return a*b;
    }

    public int calD(int a, int b){
        if (b==0)
            return b;
        else return a/b;
    }
}
