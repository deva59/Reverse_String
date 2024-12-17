package String_Buffer;
import java.util.*;
    class  Reverse_String{
        public static void main(String[] args) {
            String name = "nayan";
            String rev = "";
            for(int i=name.length()-1;i>=0;i--){
                rev = rev + name.charAt(i);
            }
            if(rev.equals(name)){
                System.out.println("Its Palin");
            }else {
                System.out.println("Is not palin");
            }
        }
    }
