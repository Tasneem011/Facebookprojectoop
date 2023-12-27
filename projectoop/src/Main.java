import com.java.model.User;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.setId(scanner.nextInt());
        user.setName(scanner.next());
        user.setEmail(scanner.next());
        user.setPassword(scanner.next());
       
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.getChats());
        System.out.println(user.getMessages());






        }
    }
