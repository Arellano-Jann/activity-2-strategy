public abstract class GameUnit{
    Weapon unitAttack;
    MoveType unitMove; 

    public void setAttack(Weapon atk){
        this.unitAttack = atk;
    }
    public void setMove(MoveType mve){
        this.unitMove = mve;
    }
    public void doAttack(){ this.unitAttack.attack(); }
    public void doMove(){
        this.unitMove.move();
    }
}