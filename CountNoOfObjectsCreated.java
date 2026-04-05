package strings;

public class CountNoOfObjectsCreated {
    static int  objectsCount = 0;
    {
        objectsCount++;
    }
    public CountNoOfObjectsCreated() {}
    public CountNoOfObjectsCreated(int n){}
    public CountNoOfObjectsCreated(String s){}
    public static void main(String[] args) {
        CountNoOfObjectsCreated obj = new CountNoOfObjectsCreated();
        CountNoOfObjectsCreated obj2 = new CountNoOfObjectsCreated("Hello");
        CountNoOfObjectsCreated obj3 = new CountNoOfObjectsCreated(10);

        System.out.println("Total No of objects created is : "+objectsCount);
    }
}
