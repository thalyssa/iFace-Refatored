import java.util.ArrayList;
import java.util.Scanner;

public class user {

    private int id;
    private String login;
    private String password;
    private String username;
    private ArrayList<user> friends = new ArrayList<user>();
    private ArrayList<user> request = new ArrayList<user>(); //Lista para os pedidos de amizade
    private ArrayList<String> messages = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void getFriendshipRequests(){
        if(request.size()>0){
            while(request.size()>0) {

                int i = 0;
                int option;
                Scanner key = new Scanner(System.in);

                System.out.println("O usuário " + request.get(i).username + " deseja ser seu amigo");
                System.out.println("Digite 1 para aceitar ou 2 para recusar");

                option = key.nextInt();

                if(option == 1){
                    //Colocar os usuários um na lista de amigos do outro;
                    friends.add(request.get(i));
                }

                request.remove(request.get(i));
                getFriendsList();
                i++;

            }//Fim do while
        }//Fim if
        else{
            System.out.println("Você não tem novos pedidos de amizade");
        }
    }

    public void addFriendshipRequest(user candidate){
        request.add(candidate);
    }

    public void getFriendsList(){
        System.out.println("--LISTA DE AMIGOS--");
        for(int i=0;i<friends.size();i++) {
            System.out.println(friends.get(i).username);
        }//Fim do for
    }

    public void recieveMessage(String message){
        messages.add(message);
    }


    //Exibe as mensagens do usuário
    public void getMessages(){
        System.out.println("--CAIXA DE MENSAGENS--");
        for(int i=0;i<messages.size();i++){
            System.out.println(messages.get(i)+"\n");
        }

    }

    public user(int id, String login, String password, String username){
        this.id = id;
        this.login = login;
        this.password = password;
        this.username = username;
    }

    public user(int id){
        this.id = id;
    }

}
