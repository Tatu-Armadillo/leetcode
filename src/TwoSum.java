public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;

        int[] reponse = new int[2];
        int indice1 = 0;
        int indice2 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                indice1 = i;
                indice2 = j;
                if (sum == target) {
                    reponse[0] = indice1;
                    reponse[1] = indice2;
                    return reponse;
                }
            }

        }
        return reponse;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        int[] response = twoSum(nums, target);
        System.out.println("[" + response[0] + "," + response[1] + "]");
    }
}