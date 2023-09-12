public class Grunt extends GameUnit{
    public Grunt(){
        System.out.println("new Grunt");
        unitAttack = new GruntAttack_Axe();
        unitMove = new GruntMove_Walk(); 
    }

    public void change(){
        System.out.println("chnage Grunt");
        unitAttack = new GruntAttack_Pistol();
        unitMove = new GruntMove_Walk(); 
    }
}