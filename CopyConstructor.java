public class CopyConstructor {
    String name;
    int id;
    CopyConstructor(String name, int id){
        this.name = name;
        this.id = id;
    }
    CopyConstructor(CopyConstructor object){
        this.name = object.name;
        this.id = object.id;
    }
}

class Calling {
    public static void main(String[] args){
        System.out.println("1st object");
        CopyConstructor copyConstructor = new CopyConstructor("Deekshith",24);
        System.out.println("Name: "+copyConstructor.name + " and ID: "+copyConstructor.id);

        System.out.println("2nd object");
        CopyConstructor copyConstructor1 = new CopyConstructor(copyConstructor);
        System.out.println("Name: "+copyConstructor1.name + " and ID: "+copyConstructor1.id);
    }
}
