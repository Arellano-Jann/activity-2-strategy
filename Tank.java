public class Tank extends GameUnit{
    public Tank(){
        System.out.println("new Tank");
        unitAttack = new TankAttack_Canon();
        unitMove = new TankMove_Driving();
    }

    public void change(){
        System.out.println("chnage Tank");
        unitAttack = new TankAttack_Rocket();
        unitMove = new TankMove_Flying(); 
    }
    
}