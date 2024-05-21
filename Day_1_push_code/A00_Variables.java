package a00_Introduction;

class A00_Variables
{
   
    public static void main(String[] args) {

        /*Varibles:---
       1. Varibles is the name of memory location where we can store the data
       2.Each varible shoulsd have unique value
       --> Why we used varibles
       1. Using varibles we can used that data  again and agian
       2. Using varibles we can perfrom multiple operation on data . */ 

       System.out.println("Types of varibles:");
       /*Types 
       1. Local varibles
       2.Instamce varibles
       3.Static varibles */ 

        System.out.println("Local varibles");
        /*1.Local varibles are declare inside the method , block and constructore.
         * 2. scope of local varible sis inside the method.
         * 3.local varibles are stored in stack memory.
         * Local varible dont have defulut value.
         */

        void add()
        {
            int a=10;
        }
    
    }
}