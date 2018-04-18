public class Puppy{
	int puppyage;
	public Puppy(String name){
		System.out.println("puppy name is " + name);
		}

	
	public void setAge(int age)
	{
		puppyage = age;
		}
		
	public int getAge(){
		System.out.println("puppy age is :" + puppyage);
		return puppyage;
		}
	public static void main(String []args)
	{
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge( );
		System.out.println("puppy age in main is " + myPuppy.puppyage); 
		}
	
		}	