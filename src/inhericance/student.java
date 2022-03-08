package inhericance;
  
 class student extends Person {
     String universityName;
     student(String universityName  ,String name, String age, String height) {
		super(name, age, height);
        this.universityName=universityName;  
	}
    
    public void getInfo(){
        super.getInfo();
        System.out.println("university  Name :"+universityName);
    }
    
    
}
