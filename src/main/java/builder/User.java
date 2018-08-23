package builder;

public class User {

    private String name;
    private String lastName;
    private String adress;
    private String city;
    private String postalCode;
    private String email;
    private String telephoneNumber;
    private int age;

    public User(UserBuilder  userBuilder){
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.adress = userBuilder.adress;
        this.city = userBuilder.city;
        this.postalCode = userBuilder.postalCode;
        this.email = userBuilder.email;
        this.telephoneNumber = userBuilder.telephoneNumber;
        this.age = userBuilder.age;
    }

    public static class UserBuilder{
        private String name;
        private String lastName;
        private String adress;
        private String city;
        private String postalCode;
        private String email;
        private String telephoneNumber;
        private int age;

        public UserBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder adress(String adress){
            this.adress = adress;
            return this;
        }

        public UserBuilder city(String city){
            this.city = city;
            return this;
        }

        public UserBuilder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public UserBuilder telephoneNumber(String telephoneNumber){
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
