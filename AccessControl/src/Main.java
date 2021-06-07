import task5Package.Task5;
import task1.Task1;
import static debugoff.Debug.debug;
//import static debug.Debug.debug;



public class Main {
    public static void main(String[] args) {


        // Task 1
        /*
        Определите класс в пакете. Создайте экземпляр класса за пределами пакета.
        */
        Task1 task1 = new Task1();


        // Task 3
        /*
        Создайте два пакета debug и debugoff, содержащие одинаковые классы с методом
        debug(). Первая версия выводит на консоль свой аргумент типа String, вторая не
        делает ничего. Используйте директиву static import для импортирования класса
        в тестовую программу и продемонстрируйте эффект условной компиляции.
        */

        /*
        When we change import in 2-3 lines, we change our method "debug"
         */

        debug("Hi, I'm debug");


        // Task 4
        /*
        Покажите, что методы со спецификатором protected обладают доступом в преде-
        лах пакета, но не являются открытыми.
        */

         //! Task4.test();            //We can't use it!


        // Task 5
        /*
        Создайте класс с полями и методами, обладающими разными уровнями досту-
        па: public, private, protected, доступом в пределах пакета. Создайте объект этого
        класса и посмотрите, какие сообщения выдает компилятор при попытке обращения
        к разным членам класса. Учтите, что классы, находящиеся в одном каталоге, входят
        в «пакет по умолчанию».
         */

        Task5 task5 = new Task5();
        System.out.println(task5.getPublicString());


        //! System.out.println(task5.getProtectedString());
        //! System.out.println(task5.getInPacAccess());
        //! System.out.println(task5.getPrivateString());



        //Task 6
        /*
        Создайте класс с защищенными данными. Создайте в том же файле второй класс
        с методом, работающим с защищенными данными из первого класса.
         */

        // in task6 pac;



        // Task 8
        /*
        По образцу примера Lunch.java создайте класс с именем ConnectionManager,
        который управляет фиксированным массивом объектов Connection. Программист-
        клиент не должен напрямую создавать объекты Connection, а может получать их
        только с помощью статического метода в классе ConnectionManager. Когда запас
        объектов у класса ConnectionManager будет исчерпан, он должен вернуть ссылку
        null. Протестируйте классы в методе main().
         */

        // in task8 pac;







    }

}
