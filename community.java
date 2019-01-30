import java.util.ArrayList;

public class community extends messages{

    private int id;
    private ArrayList<user> members = new ArrayList<user>();
    private ArrayList<String> messages = new ArrayList<String>();
    private user owner; //Dono da comunidade
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public user getOwner() {
        return owner;
    }

    public void setOwner(user owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addMember(user newMember){
        members.add(newMember);
    }

    public void getMembersList(){
        System.out.println("--MEMBROS--");
        for(int i=0;i<members.size();i++) {
            System.out.println(members.get(i).getUsername());
        }//Fim do for
    }

    public boolean isMember(user member){
        for(int i=0;i<members.size();i++){
            if(members.get(i).equals(member)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void recieveMessage(String msg){
        messages.add(msg);
    }

    @Override
    public void getMessages() {
            System.out.println("--CAIXA DE MENSAGENS - COMUNIDADE:" + this.getName() + "--");
            for(int i=0;i<messages.size();i++) {
                System.out.println(messages.get(i) + "\n");
            }
    }

    public community(int id, user owner, String name, String description){
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.description = description;
    }
}
