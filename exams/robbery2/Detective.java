package exams.robbery2;

public class Detective extends Person {

    public static final int SUCCESS_PERCENTAGE = 20;

    public Detective(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickName, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Detective: ");
        super.printBioData();
    }
}
