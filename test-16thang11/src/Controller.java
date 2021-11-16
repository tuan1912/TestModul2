import java.util.Scanner;

public class Controller {
    static  Scanner scanner = new Scanner(System.in);
    static Staff[] arrayOfStaff = new Staff[0];
    public static Staff createNewStaff(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        return new Staff(name,phone,address);
    }
    public static void addNewStaff(Staff newStaff){
        Staff[] newArrayOfStaff = new Staff[arrayOfStaff.length+1];
        for (int i = 0; i < arrayOfStaff.length; i++) {
            newArrayOfStaff[i] = arrayOfStaff[i];
        }
        newArrayOfStaff[newArrayOfStaff.length-1] = newStaff;
        arrayOfStaff = newArrayOfStaff;
    }
    public static void showStaffByName(){
        System.out.println("Enter a name you want to find:");
        String name = scanner.nextLine();
        for (int i = 0; i < arrayOfStaff.length; i++) {
            if (arrayOfStaff[i].getName().equals(name)) System.out.println(arrayOfStaff[i].toString());
        }
    }
    public static int getIndexByStaffId(int staffId){
        for (int i = 0; i < arrayOfStaff.length; i++) {
            if (arrayOfStaff[i].getStaffId()==staffId) return i;
        }
        return -1;
    }
    public static void removeStaffByStaffId(int  staffId){
        Staff[] newArrayOfStaff = new Staff[arrayOfStaff.length-1];
        int index = getIndexByStaffId(staffId);
        if (index > -1){
            for (int i = 0; i < newArrayOfStaff.length; i++) {
                if (i < index) newArrayOfStaff[i] = arrayOfStaff[i];
                else newArrayOfStaff[i] = arrayOfStaff[i+1];
            }
        } else System.out.println("Oops!");
        arrayOfStaff = newArrayOfStaff;

    }
    public static void showAllOfStaff(){
        for (Staff staff : arrayOfStaff ) System.out.println(staff.toString());
    }
    public static void changeInformation(int staffId) {
        int index = getIndexByStaffId(staffId);
        if (index > -1) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone number:");
            String phone = scanner.nextLine();
            System.out.println("Enter address:");
            String address = scanner.nextLine();
            arrayOfStaff[index].setName(name);
            arrayOfStaff[index].setPhone(phone);
            arrayOfStaff[index].setAddress(address);
        }
    }


}
