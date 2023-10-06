import generatearray.generateArray;
import java.util.ArrayList;
import java.util.Scanner;

public class exercice17 {
    public static void main(String[] args){
        generateArray objet = new generateArray();
        objet.generate(10,100);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liste = objet.getList();
        System.out.println("Liste d'origine : " + liste);

        for(Integer i = 0; i < 5; i++){
            System.out.println("Entrez un nombre : ");
            Integer nouveauNum = scanner.nextInt();
            if(nouveauNum >= 0){
                objet.addItem(nouveauNum);
            }
            //Condition fonctionne pas comme prévu
            /else{
                System.out.println("Entrez un nombre ! : ");
                nouveauNum = scanner.nextInt();
            }/
        }
        scanner.close();
        liste = objet.getList();
        System.out.println("Liste d'origine avec inputs : " + liste);
        for(Integer i = 0; i < liste.size() - 1; i++){
            for(Integer j = 0; j < liste.size() - i - 1; j++){
                if(liste.get(j) < liste.get(j + 1)){
                    Integer temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
        System.out.println("Liste triée : " + liste);
    }
}