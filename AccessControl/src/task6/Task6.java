package task6;

public class Task6 {
    protected String protectedString;
    protected int protectedInt;
    protected double protectedDouble;


}


class Refactor extends Task6{
    public String getProtectedString() {
        return protectedString;
    }

    public void setProtectedString(String protectedString) {
        this.protectedString = protectedString;
    }

    public int getProtectedInt() {
        return protectedInt;
    }

    public void setProtectedInt(int protectedInt) {
        this.protectedInt = protectedInt;
    }

    public double getProtectedDouble() {
        return protectedDouble;
    }

    public void setProtectedDouble(double protectedDouble) {
        this.protectedDouble = protectedDouble;
    }
}