import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Create new staff");
            System.out.println("2. Remove staff");
            System.out.println("3. Show all of staff");
            System.out.println("4. Change information");
            choice = parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Staff newStaff = Controller.createNewStaff();
                    Controller.addNewStaff(newStaff);
                    break;
                case 2:
                    Controller.showStaffByName();
                    System.out.println("Enter staff id you wanna remove:");
                    int staffIdCase3 = Integer.parseInt(scanner.nextLine());
                    Controller.removeStaffByStaffId(staffIdCase3);
                    break;
                case 3:
                    Controller.showAllOfStaff();
                    break;
                case 4:
                    Controller.showStaffByName();
                    System.out.println("Enter staff id you wanna change:");
                    int staffIdCase4 = Integer.parseInt(scanner.nextLine());
                    Controller.changeInformation(staffIdCase4);
                    break;

            }
        }
    }
}
