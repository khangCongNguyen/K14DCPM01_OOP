package inhericance;

 class Person {
    //attribute
    String name;
     String age;
    String height;

    //method
    Person(String name,String age,String height){
        this.age=age;
        this.name=name;
        this.height=height;
    }

    void getInfo(){
        System.out.println("Name :"+name);
        System.out.println("age :"+age);
        System.out.println("height :"+height);
    }

  
    

    
}
