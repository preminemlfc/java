import java.util.*;
public class footballuserinput {
    public static void main(String[] args){
        Scanner fsg = new Scanner(System.in);
        while(true){
            System.out.println("\nChoose one:\n1.Teams\n2.Players\n3.Trophies");
            int choice = fsg.nextInt();
            switch(choice){

                case 1 :
                    Teams();
                    break;
                     case 2:
                    Players();
                    break;
                case 3 :
                    Trophies();
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;


            }




        }

    }
    public static void Teams(){
        Scanner fsg = new Scanner(System.in);
        System.out.println("Enter team name:");
        String teamname = fsg.nextLine();
        System.out.println("Enter team country");
        String teamcountry = fsg.nextLine();


    }
    public static void Players(){
        Scanner fsg = new Scanner(System.in);
        System.out.println("Enter player name :");
        String playername = fsg.nextLine();
        System.out.println("Enter player age :");
        String playerage = fsg.nextLine();

    }
    public static void Trophies(){
        Scanner fsg = new Scanner(System.in);
        System.out.println("Enter trophies won:");
        String trophieswon = fsg.nextLine();

    }
}
