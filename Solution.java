import java.util.*;

    public class Solution {


        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);

            String str = scan.nextLine();
            int x = 0;
            String lr;
            for(int i = 0; i<str.length(); i++) {
                if(str.substring(i)=="-") {
                    x++;
                }
                if(str.substring(i)=="/" && str.substring(i+1)=="\\") {
                    lr = "left";
                }
                if(str.substring(i)=="\\" && str.substring(i+1)=="/") {
                    lr = "right";
                }
            }
            scan.close();
        }
    }

