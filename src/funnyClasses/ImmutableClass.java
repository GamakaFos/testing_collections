package funnyClasses;

public class ImmutableClass {
    //as I understand immutability in Java(and in IT in general)
    //final keyword does nothing for immutability
    //but to achieve immutability we need to create a class with read only methods


    //any of them will work
    //private(no matter if it is final or not) will not be available to achieve from code
    private final int myUnrealBirthDateDay;

    //as we only will create this variable through constructor in the time of creation,
    //and we don't have another constructors it will be impossible to change it(although it looks kind cringy as for me)
    public final int myUnrealBirthDateMonth;

    //as we will not have any setters or another classes, that will be
    //manipulating next int value, it still will be fine to use it in immutable class
    private int myUnrealBirthDateYear;


    public ImmutableClass(int day, int month, int year){
        this.myUnrealBirthDateDay = day;
        this.myUnrealBirthDateMonth = month;
        this.myUnrealBirthDateYear = year;
    }


    //so. to keep immutability we will only have read only methods
    public int getMyUnrealBirthDateDay() {
        return myUnrealBirthDateDay;
    }

    public int getMyUnrealBirthDateMonth() {
        return myUnrealBirthDateMonth;
    }

    public int getMyUnrealBirthDateYear() {
        return myUnrealBirthDateYear;
    }

    public void getDateOfBirth(){
        System.out.println(this.toString());
    }

    public String toString(){
        return myUnrealBirthDateDay + "." + myUnrealBirthDateMonth + "." + myUnrealBirthDateYear;
    }

}
