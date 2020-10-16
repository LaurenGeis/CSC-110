public class marry {

    public static void main(String[] args) {
        int weight = 150;
        int age = 24;
        int height = 71;
        boolean isASmoker = false;
        boolean isMale = true;
        boolean isGoodLooking = true;
        boolean isAbleToRelocate = true;

        if ((weight < 160) && (age <= 27) && (age >= 22) && (height < 72) && (isASmoker == false) && (isMale == true) && (isGoodLooking == true) && (isAbleToRelocate == true)) {
            System.out.println("Marry Me!");
        }
        else {
            System.out.println("Get Lost!");
        }
    }
}