package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char c = Character.toLowerCase(character);
        boolean vowel = c == 'a' || c == 'o' || c == 'e' || c == 'i'|| c == 'u';
        if (vowel)
            System.out.println("Vowel");
        else if (c >= 'b' && c <= 'z')
            System.out.println("Consonant");
        else
            System.out.println("wrong alphabet!");
    }
}
