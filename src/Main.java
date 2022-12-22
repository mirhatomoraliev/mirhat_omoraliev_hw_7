import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] heroes = {new Magic(), new Medic(), new Warrior()};

        for(int i=0; i<heroes.length; i++){
            System.out.println("-------------------------");
            heroes[i].applySuperAbility();
            if(heroes[i] instanceof Medic){
                ((Medic) heroes[i]).increaseExperience();
            }
        }
    }
    /*
    4. В классе Main создать массив из 3х разных героев, затем через цикл применить
    суперспособность каждого героя.
     */
}