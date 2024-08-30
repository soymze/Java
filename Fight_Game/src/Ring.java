public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        boolean starter = flipCoin();
        System.out.println(starter);
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if(starter){
                    f1.health = f2.hit(f1);
                }else{
                    f2.health = f1.hit(f2);
                }
                if (isWin()){
                    break;
                }
                if(starter){
                    f2.health = f1.hit(f2);
                }else{
                    f1.health = f2.hit(f1);
                }
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean flipCoin() {
        double f1Random = Math.random() * 2;
        double f2Random = Math.random() * 2;

        if(f1Random > f2Random){
            return true;
        }else if(f2Random > f1Random){
            return false;
        }else{
            flipCoin();
        }
        return false;
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}