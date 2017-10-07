/**
 * Created by starhaotian on 02/10/2017.
 */
public class Hw_4_Q2 {
}

class Tool{
    protected int strength;
    protected char type;
    public void setStrength(int strength){
        this.strength = strength;
    }

    //add your code here
}

/*

	Implement class Scissors

*/

class Scissors extends Tool{

    public Scissors(int strength){
        setStrength(strength);
        type = 'r';
    }

    public boolean fight(Tool obj_a){
        if (obj_a.type == 'p'){
            this.strength = strength * 2;
            return true;
        }
        else {
            this.strength = strength / 2;
            return false;
        }

    }


}

/*

	Implement class Paper

*/
class Paper extends Tool{
    public Paper(int strength){
        setStrength(strength);
        type = 'p';
    }

    public boolean fight(Tool obj_a){
        if (obj_a.type== 'r'){
            this.strength = strength * 2;
            return true;
        }
        else {
            this.strength = strength / 2;
            return false;
        }
    }

}

/*

	Implement class Rock

*/

class Rock extends Tool{
    public Rock(int strength){
        setStrength(strength);
        type = 'r';
    }

    public boolean fight(Tool obj_a){
        if (obj_a.type == 's'){
            this.strength = strength * 2;
            return true;
        }
        else {
            this.strength = strength / 2;
            return false;
        }
    }

}

class RockPaperScissorsGame{

    public static void main(String args[]){

        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);

        System.out.println(s.fight(p) + " , "+ p.fight(s) );
        System.out.println(p.fight(r) + " , "+ r.fight(p) );
        System.out.println(r.fight(s) + " , "+ s.fight(r) );


    }
}
