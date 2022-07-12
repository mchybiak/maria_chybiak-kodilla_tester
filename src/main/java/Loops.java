public class Loops {
        int[] numbers = new int[] {2,1,3,4,1};
        public int sumNumbers(int[] numbers){
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;
        }
}