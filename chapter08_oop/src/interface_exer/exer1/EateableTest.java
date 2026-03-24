package interface_exer.exer1;

public class EateableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[4];
        eatables[0] = new Indian();
        eatables[1] = new American();
        eatables[2] = new Indian();
        eatables[3] = new Chinses();
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
