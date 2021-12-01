public class Driver {
    public static void main(String[] args){
        rps("rock", "paper");
        rps("paper", "rock");
        rps("paper", "scissors");
        rps("scissors", "scissors");
        rps("scissors", "paper");
    }

    public static void rps(String p1, String p2){
        String resp = "";
        switch(p1){
            case "rock":
                if(p1.equals(p2)){
                    resp = "TIE";
                }
                else if(p2.equals("paper")){
                    resp = "Player 2 wins";
                }
                else if(p2.equals("scissors")){
                    resp = "Player 1 wins";
                }
                else{
                    resp = "Invalid response from player 2";
                }
                break;
            case "paper":
                if(p1.equals(p2)){
                    resp = "TIE";
                }
                else if(p2.equals("scissors")){
                    resp = "Player 2 wins";
                }
                else if(p2.equals("rock")){
                    resp = "Player 1 wins";
                }
                else{
                    resp = "Invalid response from player 2";
                }
                break;
            case "scissors":
                if(p1.equals(p2)){
                    resp = "TIE";
                }
                else if(p2.equals("rock")){
                    resp = "Player 2 wins";
                }
                else if(p2.equals("paper")){
                    resp = "Player 1 wins";
                }
                else{
                    resp = "Invalid response from player 2";
                }
                break;
            default: resp = "Invalid response from player 1";
        }
        System.out.println(resp);
    }
}
