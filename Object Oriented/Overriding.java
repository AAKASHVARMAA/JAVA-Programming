class Education
{
    void Edu(){
        System.out.println("having education");
    }
    
}
class Overriding extends Education{
    void Edu(){
        System.out.println("Graduated with b.tech degree");
    }
    public static void main(String[] args)
    {
        Overriding ed= new Overriding();
        ed.Edu();
        Education Ed2= new Education();
        Ed2.Edu();
    }
}