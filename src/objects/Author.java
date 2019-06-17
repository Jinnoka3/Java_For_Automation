public class Author{
    String firstName;
    String lastName;
    Author(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }
    protected String displayInfo(){
        return "Author's name: " + firstName + " " + lastName;
    }
}
