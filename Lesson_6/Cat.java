import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Cat {
    String name;
    int age;
    String color;
    String breed;
    String gender;
    Boolean purring;
    int id;

    
    

    public Cat(String name,
        int age,
        String color,
        String breed,
        String gender,
        Boolean purring,
        int id){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.breed = breed;
            this.color = color;
            this.purring = purring;
            this.id = id ;}


    public String printCat() {
        return "Name:"+ name + ", breed:" + breed + ", color:" + color + ", age: " + age;
    }
    
    public List <Cat> faidCat(HashSet <Cat> hashCat,String gender){
        List <Cat> catList = new ArrayList<Cat>();
        for (Cat cat : hashCat) {
            if (cat.gender.equals(gender)) {
                catList.add(cat);
            }
            
        }
        return catList;
    }


    
}
