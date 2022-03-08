package inhericance;
  
 class student extends Person {
     //thê, thuộc tính cho student
     String universityName;
     student(String universityName  ,String name, String age, String height) {
		super(name, age, height);
        this.universityName=universityName;  
	}
    //thêm attributr for function
    public void getInfo(){
        super.getInfo();
        System.out.println("university  Name :"+universityName);
    }
    
    
}
