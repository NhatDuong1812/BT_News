import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---NEWS---");
            System.out.println("1. Add.");
            System.out.println("2. View.");
            System.out.println("3. Average rate.");
            System.out.println("4. Exit.");
            Scanner sc = new Scanner(System.in);
            Methods mt = new Methods();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Title : ");
                    String title = sc.nextLine();
                    System.out.println("Enter Publish Date: ");
                    String publishDate = sc.nextLine();
                    System.out.println("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.println("Enter Contend: ");
                    String contend = sc.nextLine();
                    float averageRate = mt.Calculate();
                    News news = new News(id, title, publishDate, author, contend, averageRate);
                    mt.add(news);
                    System.out.println("Add complete!!");
                    break;
                case 2:
                    mt.show();
                    break;
                case 3:
                    System.out.println( mt.Calculate());
                    break;
                default:
                    break;
            }

        } while (choice != 4 );
    }
}
