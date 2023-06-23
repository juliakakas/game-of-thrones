public class GameOfThrones {
    public static void main(String[] args) {
        Character person = new Character("XYZ", "Summer", Gender.MALE);
        System.out.println("Próba: "+ person.getName() + " " + person.getBirthPlace() + " " + person.getGender());
        person.setGender(Gender.FEMALE);
        System.out.println(person.getGender());


    }
}
