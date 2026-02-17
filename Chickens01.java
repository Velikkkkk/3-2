public class Chickens01 {
    public static void main(String[] args) {
       //First scenario
        int totalEggs =0;
        int eggPerChiken =5;
        int chikenCount = 3;

        //Mon
        totalEggs = countEggs(eggPerChiken,chikenCount);

        //System.out.println("Total in Mon:"+totalEggs);

        //Tuesday
        ++chikenCount;
        totalEggs += countEggs(eggPerChiken,chikenCount);
        //System.out.println("Total in Tus:"+totalEggs);

        //Wdns
        chikenCount /= 2;
        totalEggs = countEggs(eggPerChiken,chikenCount);
        //System.out.println("Total in Wesd:"+totalEggs);

        System.out.println("Total:"+totalEggs);
    }
    //calculates totalEggs
    public static int countEggs(int eggsPerChiken, int chikenCount){
        return eggsPerChiken * chikenCount;
    }
}

