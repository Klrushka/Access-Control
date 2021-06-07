package task6;

public class Task6 {
    protected String protectedString;
    protected int protectedInt;
    protected double protectedDouble;


}


class Refactor {
    Task6 task6 = new Task6();
    public String getProtectedString() {
        return task6.protectedString;
    }

    public void setProtectedString(String protectedString) {
        task6.protectedString = protectedString;
    }

    public int getProtectedInt() {
        return task6.protectedInt;
    }

    public void setProtectedInt(int protectedInt) {
        task6.protectedInt = protectedInt;
    }

    public double getProtectedDouble() {
        return task6.protectedDouble;
    }

    public void setProtectedDouble(double protectedDouble) {
        task6.protectedDouble = protectedDouble;
    }
}