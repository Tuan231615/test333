import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Mot", "Viet Nam"));
        users.add(new User(2, "Hai", "Nam Viet"));
        writeToFile(users, "demo.txt");
        List<User> userList = readToFile("demo.txt");
        for (int i = 1; i < userList.size(); i++) {
            System.out.println(userList);
        }
    }

    public static boolean writeToFile(List<User> users, String file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static List<User> readToFile(String file) {
        List<User> users;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            users = (List<User>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}