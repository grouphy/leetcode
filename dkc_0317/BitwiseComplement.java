package dkc_0317;

public class BitwiseComplement {
	
	public static void main(String[] args) {
		System.out.println(bitwiseComplement(5));
	}
	
	public static int bitwiseComplement(int N) {
        if(N == 0){
            return 1;
        }
        int count = 0;
        int i = N;
        while(N != 0){
            N /= 2;
            count ++;
        }
        return i^(int)Math.pow(2,count)-1;
    }
}
