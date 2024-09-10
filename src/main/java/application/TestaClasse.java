package application;

import entities.*;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        //Criando objetos
        Bike bike = new Bike("Trek", "Speed", 2023);
        Book book = new Book("Lupin", "Mauricie Leblanc", 2023);
        Car car = new Car("Toyota", "Yaris", 2023);
        Controller controller = new Controller("Microsoft", "Black piano", "Xbox Series X");
        Laptop laptop = new Laptop("Lenovo", "ideapad 330", "i5 8th Gen");
        Notebook notebook = new Notebook("Tilibra", "Graphite", 96);
        Pen pen = new Pen("Bic", "Blue", "Ballpoint");
        Shoe shoe = new Shoe("Macboot", "Brown", "High top boot");
        Smartphone smartphone = new Smartphone("Samsung", "S24 Ultra", 6.5);
        Watch watch = new Watch("Xiaomi", "Mi Band 6", "Digital");

        Scanner sc = new Scanner(System.in);
        boolean rpt = true;

        while (rpt) {
            System.out.println("____________________________");
            System.out.println("|          Methods         |");
            System.out.println("----------------------------");
            System.out.println("| 1. Ride the bike");
            System.out.println("| 2. Change bike's tire");
            System.out.println("| 3. Open a book");
            System.out.println("| 4. Go to next book's page");
            System.out.println("| 5. Accelerate the car");
            System.out.println("| 6. Open car's doors");
            System.out.println("| 7. Turn on controller");
            System.out.println("| 8. Press the start button");
            System.out.println("| 9. Update the laptop");
            System.out.println("| 10. Upgrade laptop's RAM");
            System.out.println("| 11. Remove a page from notebook");
            System.out.println("| 12. Close notebook");
            System.out.println("| 13. Write with the pen");
            System.out.println("| 14. Put the pen cap on");
            System.out.println("| 15. Wear shoes");
            System.out.println("| 16. Clean shoes");
            System.out.println("| 17. Take a photo with the smartphone");
            System.out.println("| 18. Charge the phone");
            System.out.println("| 19. Adjust the watch's time");
            System.out.println("| 20. Start timer");
            System.out.println("| 0. End execution");
            System.out.printf("%n%nChoose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    bike.ride();
                    break;
                case 2:
                    bike.changeTires();
                    break;
                case 3:
                    book.open();
                    break;
                case 4:
                    book.nextPage();
                    break;
                case 5:
                    car.accelerate();
                    break;
                case 6:
                    car.openDoors();
                    break;
                case 7:
                    controller.turnOn();
                    break;
                case 8:
                    controller.pressStart();
                    break;
                case 9:
                    laptop.update();
                    break;
                case 10:
                    laptop.upgradeRAM();
                    break;
                case 11:
                    notebook.removePage();
                    break;
                case 12:
                    notebook.close();
                    break;
                case 13:
                    pen.write();
                    break;
                case 14:
                    pen.putCap();
                    break;
                case 15:
                    shoe.wear();
                    break;
                case 16:
                    shoe.clean();
                    break;
                case 17:
                    smartphone.takePhoto();
                    break;
                case 18:
                    smartphone.charge();
                    break;
                case 19:
                    watch.adjustTime();
                    break;
                case 20:
                    watch.startTimer();
                    break;
                case 0:
                    rpt = false;
                    System.out.println("Ending execution!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            if (option != 0) {
                System.out.printf("%nPress enter to continue...");
                sc.nextLine();
                sc.nextLine();
            }
        }

        sc.close();
    }
}
