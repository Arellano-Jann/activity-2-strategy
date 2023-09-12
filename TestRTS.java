public class TestRTS{
    public static void main(String[] args){
        Grunt grunt = new Grunt();
        Tank tank = new Tank();
        grunt.doMove(); // original behavior
        tank.doMove();
        grunt.doAttack();
        tank.doAttack();

        tank.change(); // changes behavior on pickup
        grunt.change();

        grunt.doMove(); // new behavior
        tank.doMove();
        grunt.doAttack();
        tank.doAttack();
    }
}