public class Practical_4Main
{
    public static void main(String[] args) 
    {
        Practical_4 qobj =new Practical_4();

        for (int i = 0; i < 20; i++)
        {
            qobj.enqueue(i + 1);
        }

        int queueSize = qobj.getSize();
        System.out.println("Values in the Queue are: ");
        
        for (int j = 0; j < queueSize; j++) 
        {
            System.out.printf("Value %d is: %d%n", j+1, qobj.dequeue());
        }
        
        System.out.println("\nSize of Queue : " + qobj.getSize());
        
        System.out.println("prepared by 21CE153_grisha");
    }
}

