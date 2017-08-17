package homework.homework01.Task_03;

public class MortalKombat {

	public static void main(String[] args) {

		Fighter scorpion = new Fighter();
		scorpion.name = "Scorpion";
		Fighter kano = new Fighter();
		kano.name = "Kano";
		scorpion.enemy = kano;
		kano.enemy = scorpion;

		while (true) {

			if (scorpion.randomNumber() < 50) {
				System.out.println("An attempt to make damage by Scorpion to Kano.");
				scorpion.strike();
				System.out.println("Kano's life left: " + kano.health);
				if (kano.isDead()) {
					System.out.println("Scorpion won!!!");
					break;
				}
			} else {
				System.out.println("An attempt to make damage by Kano to Scorpion.");
				kano.strike();
				System.out.println("Scorpion's life left: " + scorpion.health);
				if (scorpion.isDead()) {
					System.out.println("Kano won!!!");
					break;
				}
			}

		}

	}
}
