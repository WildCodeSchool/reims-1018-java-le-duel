public class Spell {
  
    private int id;
    private String name;
    private String weakness;
    private String type;


    public Spell(int id, String name, String weakness, String type){
        this.id = id;
        this.name = name;
        this.weakness = weakness;
        this.type = type;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getWeakness(){
        return this.weakness;
    }
    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }   
}