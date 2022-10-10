public class factorial10 {
    public void factorialR(double a, double b,int n) {
        double temp=(b-a)/n;
        for (double i =a; i <b; i+=temp){
            System.out.print(sin(i));
            if(i!=b){
                System.out.println(", ");
            }
        }

    }
    public double sin(double a){
        double temp=1-Math.sin(a);
        return temp;
    }

}
