package exams.robbery2;

public abstract class Person {

    private String name;
    private String nickName;
    private int yearOfBorn;
    private String expertIn;
    private Item[] items;

    public Person(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }

    public void printBioData(){
        System.out.println("Name: "+ name);
        System.out.println("Nickname: " + nickName);
        System.out.println("YearOfBorn: " + yearOfBorn);
        System.out.println("Expertise: " + expertIn );
        // for a for loop
        System.out.println("The person has the following items: "  );
        for (Item item : items){
            System.out.println("-" + item.getName());
        }
    }

    public String getName(){
        return name;
    }

    public String getNickName(){
        return nickName;
    }
}
