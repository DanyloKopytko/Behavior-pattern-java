abstract class Character {
    WeaponBehavior weapon;
    
    public abstract void fight();
    
    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}

class King extends Character {
    public void fight() {
        this.weapon.useWeapon();
    }
}

class Queen extends Character {
    public void fight() {
        this.weapon.useWeapon();
    }
}

class Trool extends Character {
    public void fight() {
        this.weapon.useWeapon();
    }
}

class Knight extends Character {
    public void fight() {
        this.weapon.useWeapon();
    }
}

interface WeaponBehavior {
    public void useWeapon();
}

class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Knife stab");
    }
}

class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Bow shot");
    }
}

class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Axe attacks");
    }
}

class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Sword swing");
    }
}

public class Main {
	public static void main(String[] args) {
		King myKing = new King();
		
		myKing.setWeapon(new SwordBehavior());
		
		myKing.fight();
	}
}
