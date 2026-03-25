package interface_exer.exer1;

public class EateableTest {
    public static void main(String[] args) {
        Eatable[] eatable = new Eatable[4];
        eatable[1] = new American();
        eatable[0] = new Indian();
        eatable[2] = new Indian();
        eatable[3] = new Chinses();
        for (int i = 0; i < eatable.length; i++) {
            eatable[i].eat();
        }


    }
}
