public class Character {
    private String name;
    private final String birthPlace;


    private Gender gender;

    public Character(String name, String birthPlace, Gender gender){
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
    }

    public void nameChange(String newName, String oldName){
        if (oldName == this.name){
            this.name = newName;
        }
    }

    public String getName() {
        return name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.FEMALE || this.gender == Gender.EUNUCH) {
            gender = getGender();
        }
        this.gender = gender;
    }
}
