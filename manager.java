public class manager extends person implements login {
    String email;
    String password;

    public manager(String name, int age, String email, String password) {
        super(name, age);
        setEmail(email);
        setPassword(password);
    }

    @Override
    public boolean signIn(String UserName, String password) {
        return UserName.equalsIgnoreCase(getName()) && password.equalsIgnoreCase(getPassword());
    }

    @Override
    public boolean signUp(String userName, int age, String password) {
        return userName != null && age >= 20 && password != null;
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
}
