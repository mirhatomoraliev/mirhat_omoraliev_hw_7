public class Medic extends Hero{
    private int healPoints=20;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность TREATMENT.");
    }

    public void increaseExperience(){
        healPoints += (healPoints*10)/100;
        System.out.println("Medic experience increased!!!");
    }

    /*
В классе медик добавить поле healPoints, затем добавить метод
increaseExperience, в котором бы увеличивалось количество единиц лечения на
10%.

     */
}
