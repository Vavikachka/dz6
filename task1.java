
public class task1 {
    int big, medium, small;

    public ParkingSystem(int big, int medium, int small){ 
    
        this.big=big;
        this.medium=medium;
        this.small=small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big == 0)
                return false;
            big--;
        } else if (carType == 2) {
            if (medium == 0)
                return false;
            medium--;

        } else {
            if (small == 0)
                return false;
            small--;

        }
        return true;
    }
}

class Solution {
    public static void main(String args[]) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        System.out.print(obj.addCar(1) + " ");
        System.out.print(obj.addCar(2) + " ");
        System.out.print(obj.addCar(3) + " ");
        System.out.print(obj.addCar(1) + " ");
    }

}