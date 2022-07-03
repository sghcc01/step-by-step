package com.wzk.petShop;

import com.wzk.Link;

interface Pet {
    String getName () ;
    int getAge () ;
}
class PetShop {
    private final Link pets = new Link() ;
    public void add(Pet pet) {
        pets.add(pet);
    }
    public void delete(Pet pet) {
        pets.remove(pet) ;
    }
    public Link search(String keyWord) {
        Link result = new Link() ;
        Object [] obj = this.pets.toArray() ;
        for (Object i : obj){
            Pet p = (Pet) i ;
            if (p.getName().contains(keyWord)) {
                result.add(p);
            }
        }
        return result ;
    }
}

class Cat implements Pet {
    private final String name ;
    private final int age ;
    public Cat (String name, int age) {
        this.age = age ;
        this.name = name ;
    }
    public String toString () {
        return "this cat name is " + this.name + ",this cat age is " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true ;
        }else if (o == null){
            return false ;
        }else if (!(o instanceof Cat)) {
            return false ;
        }
        Cat c = (Cat) o ;
        return this.name.equals(c.name) && this.age == c.age ;
    }

    @Override
    public int getAge() {
        return this.age ;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Dog implements Pet {
    private final String name ;
    private final int age ;
    public Dog (String name, int age) {
        this.age = age ;
        this.name = name ;
    }
    public String toString () {
        return "this dog name is " + this.name + ",this dog age is " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true ;
        }else if (o == null){
            return false ;
        }else if (!(o instanceof Dog)) {
            return false ;
        }
        Dog c = (Dog) o ;
        return this.name.equals(c.name) && this.age == c.age ;
    }

    @Override
    public int getAge() {
        return this.age ;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
public class Demo {
    public static void main(String [] args) {
        PetShop all = new PetShop() ;
        all.add(new Cat("韩猫", 1));
        all.add(new Cat("焕猫", 10));
        all.add(new Cat("英猫", 100));
        all.add(new Dog("韩狗", 1));
        all.add(new Dog("焕狗", 10));
        all.add(new Dog("英狗", 100));
        all.delete(new Dog("英狗",100));
        Link c = all.search("英") ;
        Object [] obj = c.toArray() ;
        for (Object i : obj) {
            System.out.println(i) ;
        }
    }
}
