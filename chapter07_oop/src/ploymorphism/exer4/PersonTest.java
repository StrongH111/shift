package ploymorphism.exer4;

public class PersonTest {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();
        pt.meeting(new Person());
        pt.meeting(new Man());
        pt.meeting(new Woman());
    }
    public static void meeting(Person...ps){
        for(int i = 0;i < ps.length;i++){
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man){
               Man man = (Man)ps[i];
               man.smoke();
            }else if(ps[i] instanceof Woman) {
                Woman woman = (Woman) ps[i];
                woman.makeup();
            }
        }
    }
}
