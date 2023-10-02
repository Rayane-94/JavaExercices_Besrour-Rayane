public class Main {
    public static void main(String[] args) {
        int[] numbers = {21565, 3412, 180, 1556, 182, 84, 15};
        boolean firstNumber = true; // Utilisée pour gérer la première virgule

        for (int number : numbers) {
            if (number % 3 != 0) { // Vérifie si le nombre n'est pas divisible par 3
                if (!firstNumber) {
                    System.out.print(", "); // Ajoute une virgule si ce n'est pas le premier nombre
                }
                System.out.print(number);
                firstNumber = false; // Met à jour la variable pour les prochains nombres
            }
        }

        System.out.println(); // Aller à la ligne après l'affichage
    }
}