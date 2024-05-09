package datatypes;

public class CharacterDemo {
    public static void main(String[] args) {
        //  Charcter 2 types
        // ASCII Code -  keyboard 1 byte

        char m1 = 'D';
        int a_code = (int)m1;
        System.out.println(m1);
        System.out.println(a_code);
        // Unicode
        // hindi , chinese, japanse, telgule,

        char c1 = '\u0935';
        char c2 = '\u0948';
        char c3 = '\u092D';
        System.out.println(c1+""+c2+""+c3+""+c1);

        char c4 = '\u0C2E';
        char c5 = '\u0C4C';
        char c6 = '\u0C28';
        char c7 = '\u0C3F';
        char c8 = '\u0C15';
        System.out.println(c4+""+c5+""+c6+""+c7+""+c8);

    }
}
