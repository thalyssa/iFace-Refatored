import java.util.ArrayList;

public class community {

    private int id;
    private ArrayList<user> members = new ArrayList<user>();
    private ArrayList<String> msgs = new ArrayList<String>();
    private moderator owner; //Dono da comunidade
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public moderator getOwner() {
        return owner;
    }

    public void setOwner(moderator owner) {
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

    public community(int id, moderator owner, String name, String description){
        this.id = id;
        this.owner = owner;
        this.name = name;
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
}
