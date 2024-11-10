public class Staff extends person
{
    private String id;
    String email;
    String password;

    public Staff(String name, int age, String id, String email, String password) {
        super(name, age);
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return "name: "+ getName()+
        "Age: "+getAge()+
        "Id: "+getId();
    }

}
