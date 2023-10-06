import generatearray.generateArray;

public class exercice1 {
    public static void main(String[] args){
        generateArray objet = new generateArray();
        objet.generate(10,100);
        System.out.print("Liste d'origine : ");
        System.out.println(objet.getList());

        for(Integer i = 0; i < 10 - 1; i++){
            for(Integer j = 0; j < 10 - i - 1; j++){
                if(objet.list.get(j) > objet.list.get(j + 1)){
                    Integer temp = objet.list.get(j);
                    objet.list.set(j, objet.list.get(j + 1));
                    objet.list.set(j + 1, temp);
                }
            }
        }
        System.out.print("Liste triée : ");
        System.out.println(objet.getList());
    }
}