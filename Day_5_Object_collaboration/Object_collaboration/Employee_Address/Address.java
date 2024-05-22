public class Address {
    
    private String building;
    private String city;
    private String state;
    private  int pin;

    public Address()
    {
        
    }
    public Address(String building, String city, String state, int pin) {
        this.building = building;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    @Override
    public String toString() {
        return "Address [building=" + building + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
    }

    
}
