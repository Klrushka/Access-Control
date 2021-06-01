package Task5Pac;

public class testTask5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();

        System.out.println(task5.protectedString);
        System.out.println(task5.inPacAccess);
        System.out.println(task5.publicString);
        //! System.out.println(task5.privateString);                //'privateString' has private access in 'Task5Pac.Task5'
    }
}
