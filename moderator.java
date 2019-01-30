import java.util.Scanner;

public class moderator extends user{

    private int comID;

    public void sendMessage(){
        String message;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite a mensagem a ser enviada: ");
        message = keyboard.nextLine();
    }

    public moderator(int id, String login, String password, String username, int comID) {
        super(id, login, password, username);
        this.comID = comID;
    }
}
