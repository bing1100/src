/**
 * Created by bing on 2015-03-14.
 */
public class main {
    public static void prime_finder(int j){
        for(int cand=2;cand<=j;cand++){
            boolean n = true;
            //System.out.println(cand + ":" +(double) cand + ":" + (int) Math.sqrt((double) cand));
            for(int div=2 ; div <= (int) Math.sqrt((double) cand); div++){
                //System.out.println(" "+div);
                if(cand%div == 0) {
                    n = false;
                    break;
                }
            }
            if(n){
                System.out.println( cand + "\n");
            }
        }
    }
    public static void main(String args[]){
        System.out.println("results;\n");
        prime_finder(100);
    }
}
