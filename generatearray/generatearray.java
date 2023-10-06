package generatearray;

import java.util.Random;
import java.util.ArrayList;
public class generateArray {
    public static ArrayList<Integer>list = new ArrayList<Integer>();
    public static void generate(Integer taille, Integer nbMax){
        Random rand = new Random();
        for(Integer i = 0; i < taille; i++){
            Integer randN = rand.nextInt(1,nbMax);
            if(!list.contains(randN)){
                list.add(randN);
            }
            else{
                randN = rand.nextInt(1,nbMax);
                i--;
            }
        }
    }
    public static ArrayList getList(){
        return list;
    }
}