public class passenger extends person
{

public passenger(String name,int age){
   super(name,age);

}
    public String toString()
    {
     return "Name "+ getName()+
            "Age "+ getAge();
    }
    
}
