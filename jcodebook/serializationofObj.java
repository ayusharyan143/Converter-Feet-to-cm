package jcodebook;

import java.io.* ; 


class Person implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name  ; 
    private int age  ; 
    private String password ;



    public Person( String name , int age , String password)
    {
        this.name = name ; 
        this.age = age ; 
        this.password = password ; 
    }

    public String getName()
    {
        return name ; 
    }

    public int getAge()
    {
        return age ; 
    }

    public String getPass()
    {
        return password ; 
    }


    @Override 
    public String toString()
    {
        return "Person{ Name : " + name + " , Age : " + age + " , Password : " +  password + " }" ; 
    }

}



public class serializationofObj {

    public static void main(String[] args)
    {
        
        Person p = new Person("Ayush Aryan" , 20 , "asldf@skh765%h*kjh&");


        // Serialization
        try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt")))
        {
            System.out.println("Object : " + p );
            out.writeObject(p);

            System.out.println("Object has been serialized");

        }
        catch( IOException e )
        {
            e.printStackTrace(); 
        }




        // Deserialization

        Person pDsz = null ; 

        try( ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt")))
        {
            pDsz = (Person) in.readObject() ;
            System.out.println(pDsz);
            
            System.out.println("Object has been deserialized");
        }
        catch(IOException  | ClassNotFoundException e )
        {
            e.printStackTrace();
        }
    
    }
    
}
