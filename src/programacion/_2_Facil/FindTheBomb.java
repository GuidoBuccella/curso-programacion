package programacion._2_Facil;

public class FindTheBomb {
    public static void main(String[] args) {
        System.out.println(bomb("There is a Bomb in the Studio!"));

    }

    public static String bomb(String line){

        String[] words= line.split(" ");

        for (int i=0;i< words.length;i++){
            if (words[i].equalsIgnoreCase("bomb")){
                return "DUCK!!";
            }
        }
        return "Relax, there is no bomb.";
    }
}
