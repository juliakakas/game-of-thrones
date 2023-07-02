public enum House {
    STARK("Winter is Coming", "Közeleg a Tél"),
    LANNISTER("Hear me Roar", "Halld üvöltésemet"),
    TARGARYEN("Fire and Blood", "Tűz és Vér"),
    BARATHEON("Our is the Fury", "Miénk a harag"),
    GREYJOY("We Do Not Sow", "Mi nem vetünk"),
    TYRELL("Growing Strong", "Erőssé nővünk")
    ;

    private String englishMark;
    private String magyarJelige;

    House(String englishMark, String magyarJelige){
        this.englishMark = englishMark;
        this.magyarJelige = magyarJelige;
    }

    public String getEnglishMark() {
        return englishMark;
    }

    public String getMagyarJelige() {
        return magyarJelige;
    }
}
