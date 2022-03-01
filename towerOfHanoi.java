import java.util.Random;

public class towerOfHanoi{

    void TowerOfHanoi(int n, String from_rod,String to_rod,String aux_rod){
        if (n==1){
            System.out.println("Move disk 1 from rod "+from_rod+" to rod " + to_rod);
            return ;
        }else{
            TowerOfHanoi(n-1,from_rod,aux_rod,to_rod);
            System.out.println("Move disk "+ n +" from rod "+from_rod+" to rod " + to_rod);
            TowerOfHanoi(n-1,aux_rod,to_rod,from_rod);
        }
        
        
    }

    public void run(){
        Random rand = new Random();
        int randomInteger = rand.nextInt(10);
        TowerOfHanoi(randomInteger,"A","B","C");

    }
    public static void main(String[] args)
    {
        towerOfHanoi obj = new towerOfHanoi();
        obj.run();
    }
}
