package lesson4;

public class TestImmutable {
    //immutable classes can't be changed or extended
    public static void main(String[] args) {
        Contacts c = new Contacts("Nyakallo", "Mbhele");
        System.out.println(c);
    }
}
