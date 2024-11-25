import java.util.ArrayList;
import java.lang.*;
public class Tcs {
    public static void main(String [] args){
        String [] stringList = {"Cab","Caps","Absorb","Rabbit","Manps","Cable"};
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<stringList.length;i++){
            char[] charArr = stringList[i].toCharArray();
            int len = charArr.length;
            if(len>4){
                for(int j=0;j<len-1;j++){
                    if(charArr[j]=='a' && charArr[j+1]=='b'){
                        result.add(stringList[i]);
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
