import java.util.Scanner;

public class toString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String s1;
        s.toLowerCase();
        for(int i=0;i<s.length()+1;i++){
            if(i==0 && s.charAt(i)!=' '){
                s.substring(i,i+1).toUpperCase();
            }

        }
        System.out.println(s);
    }

}
