package Day8.has_a_relationship;

//Containt Class
public class Address {
    private String street;
    private String city;
    private String state;
    private int  pincode;

    //Default Constructor
    public Address() {
        super();
    }
    //Parameterized Constructor
    public Address(String street, String city, String state, int pincode) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    //Getter and Setter
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getPincode(){
        return pincode;
    }
    public void setPincode(int pincode){
        this.pincode = pincode;
    }

    //toString method
    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
    }
   

    
}
