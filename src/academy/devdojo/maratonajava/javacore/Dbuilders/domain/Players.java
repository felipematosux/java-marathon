package academy.devdojo.maratonajava.javacore.Dbuilders.domain;

public class Players {
    private String name;
    private String position;
    private int age;
    private int marketValue;
    private char rating;
    private String[] formerTeams;

    public Players(String name, String position, int age, int marketValue, char rating){
        this();
        this.name = name;
        this.position = position;
        this.age = age;
        this.marketValue = marketValue;
        this.rating = rating;
    }

    public Players(String name, String position, int age, int marketValue, char rating, String[] formerTeams){
        this(name, position, age, marketValue, rating);
        this.formerTeams = formerTeams;
    }

    public Players(){

    }

    public void init(String name, String position, int age, int marketValue, char rating){
        this.name = name;
        this.position = position;
        this.age = age;
        this.marketValue = marketValue;
        this.rating = rating;
    }

    public void init(String name, String position, int age, int marketValue, char rating, String[] formerTeams){
        init(name, position, age, marketValue, rating);
        this.formerTeams = formerTeams;
    }

    public void print(){
        System.out.println("Player Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Age: " + this.age);
        System.out.println("Market Value: " + this.marketValue);
        System.out.println("Rating: " + this.rating);
        System.out.print("Former Teams: ");

        if(this.formerTeams == null){
            System.out.println("\n-------------------------");
            return;
        }

        for(String formerTeam : this.formerTeams){
            System.out.print(formerTeam + " ");
        }

        System.out.println("\n-------------------------");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPosition(){
        return this.position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getMarketValue(){
        return this.marketValue;
    }

    public void setMarketValue(int marketValue){
        this.marketValue = marketValue;
    }

    public char getRating(){
        return this.rating;
    }

    public void setRating(char rating){
        this.rating = rating;
    }
}
