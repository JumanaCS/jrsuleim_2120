/**
    @author Christopher Summa
    @version 1.0

    parse custom tags with the following command:

    javadoc -tag custom.require:cm:"Precondition:" -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java

    Specify an output directory for the generated files by adding the `-d ./doc` option of the above command.

    Link to the java API by adding the `-link https://docs.oracle.com/javase/8/docs/api/` option as well.
*/
public class Pokemon{

    private int myHealth;  /** @invariant myHealth >=0 */
    private int myAttackPower; /** @invariant myAttackPower >= 0 */
    private String myName; /** @invariant myName != "" */
    
    /**
        @param name The name of the Pokemon
        @param initialHealth The initial health of the Pokemon
        @param initialAttackPower The initial attack power of the Pokemon
        @since Sunday, Sep 9, 2018

        @custom.require name != ""
        @custom.require initialHealth > 0
        @custom.require initialAttackPower > 0
        @custom.ensure  getName() != "" && getName() == name
        @custom.ensure  getHealth() > 0 && getHealth() == initialHealth
        @custom.ensure  getAttackPower() > 0 && getAttackPower() == initialAttackPower
    */
    public Pokemon(String name, int initialHealth, int initialAttackPower) {
        myName = name;
        myAttackPower = initialAttackPower;
        myHealth = initialHealth;
    }

    /**
    * @return the health
    */
    //gets the health of the pokemon
    public int getHealth() {
        return myHealth;
    }

    /**
    * @return the attck power 
    */
    //gets the attack power of the pokemon
    public int getAttackPower() {
        return myAttackPower;
    }

    /**
    * @return the name 
    */
    //gets the name of the pokemon
    public String getName() {
        return myName;
    }

    /**
    * @return true if the pokemon is dead meanig it's health is 0
    */
    //gets the health of the pokemon and sees if it's 0, if so, it returns true for dead pokemon 
    public boolean isDead() {
        if (myHealth == 0)
            return true;
        return false;
    }

    /**
    * attack class that takes your pokemon's attack power and damages the other pokemon
    * @param other a pokemon you're going against
    */
    public void attack(Pokemon other) {
        other.takeDamage(this.myAttackPower, this);
    }

    /**
    * damage class that makes your pokemon take damage against the attacker pokemon
    * @param amountOfDamage the amount of damage you wil take from the attack
    * @param attacker the attacker pokemon that damages your pokemons health 
    */
    public void takeDamage(int amountOfDamage, Pokemon attacker) {
        int amtOfDamageActuallyDealt;
        if (amountOfDamage > myHealth) {
            amtOfDamageActuallyDealt = myHealth;
            myHealth = 0;
        }
        else {
            myHealth -= amountOfDamage;
            amtOfDamageActuallyDealt = amountOfDamage;
        }
    }

    /**
    *@return the name, health, attack power of your pokemon 
    */
    @Override
    public String toString() {
        String returnval = "";
        returnval += "Pokemon " + myName + ":\n\thealth: " + myHealth + "\n\tattack: " + myAttackPower;
        return returnval;
    }

} // end class Pokemon
