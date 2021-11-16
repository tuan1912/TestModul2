public class Staff {
    private static int id=1;
    private int staffId ;
    private String name;
    private String phone;
    private String address;
    public Staff(){

    }
    public Staff(String name, String phone, String address){
        staffId = id ++;
        this.address = address;
        this.phone = phone;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' + " Staff Id = " + staffId+
                '}';
    }
}
