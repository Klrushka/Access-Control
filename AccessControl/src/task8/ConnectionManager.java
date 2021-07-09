package task8;

class Connection {
    private static int countOfConnections = 0;

    private Connection() {
        countOfConnections++;
    }

    public static Connection createConnection() {
        if (countOfConnections < 10)
            return new Connection();
        else
            return null;
    }
}


public class ConnectionManager {
    public static void main(String[] args) {
        Connection [] connections = new Connection[15];
        //! Connection connection = new Connection();                   // 'Connection()' has private access in 'Task8.Connection'

        for (int i = 0; i < 15; i++){
            connections [i] = Connection.createConnection();
            System.out.println(connections[i]);
        }




    }
}
