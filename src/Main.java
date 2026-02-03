class Main {
    public static void main(String[] args) {
        String[] days = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
        int[] temp = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitationPercentage = {95, 60, 25, 5, 0, 75, 90};
        for (int i = 0; i <= days.length; i++) {
            if (temp[i] <= 32) {
                System.out.println("Temp is less than or equal to 32 degrees " + temp[i]);
            } else {
                System.out.println(temp[i]);
            }

            if(50 <= precipitationPercentage[i]) {
                System.out.println("Likely to snow " + precipitationPercentage[i]);
                System.out.println("On " + days[i]);
            }
            else{
                System.out.println(precipitationPercentage[i]);
            }
        }


    }
}