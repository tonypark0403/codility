public class BinaryGap {
    public static void main(String[] args){
        System.out.println(solution(9));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        boolean check = false;
        int result = 0;
        if(N > 4) {
            while((N & 1) == 0){
                N /= 2;
            }
            int binaryGap = 0;
            while(N > 0) {
                if ((N & 1) == 0) {
                    binaryGap++;
                } else if (binaryGap != 0) {
                    result = (result < binaryGap) ? binaryGap : result;
                    binaryGap = 0;
                }
                N /= 2;
            }
        }
        return result;
    }
}