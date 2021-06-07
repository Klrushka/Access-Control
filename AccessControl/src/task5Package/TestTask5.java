package task5Package;

public class TestTask5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();

        System.out.println(task5.getProtectedString());
        System.out.println(task5.getInPacAccess());
        System.out.println(task5.getPublicString());
        //! System.out.println(task5.getPrivateString());                //'privateString' has private access in 'Task5Pac.Task5'
    }
}
