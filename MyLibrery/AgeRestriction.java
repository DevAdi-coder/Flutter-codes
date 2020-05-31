package MyLibrery;
public class AgeRestriction extends Exception
{
    int restrictedAge;
    public AgeRestriction(int age)
    {
        restrictedAge=age;
    }
    public String toString(){
        return "Your age is "+restrictedAge+". According to UAF, minimum age should be 18";
    }
}
