package bean;

/**
 * @author wbj
 * @create 2022-11-24 22:51
 */
public class School {
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void te(){
        System.out.println("hhhh");
    }
}
