import java.util.*;
public class AjiraNet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>(); 
        HashMap<String,String> hash = new HashMap<String,String>();
        
        while(true){
            String str = sc.nextLine();
            String[] inp = str.split(" ");
            //  for(int i=0;i<inp.length;i++){
            //      System.out.println(inp[i]);
            //  }
            for(int i=0;i<inp.length-1;i++){
                if(inp[0]=="ADD" && inp[1]=="COMPUTER"){
                    arr.add(inp[1]);
                    arr.add(inp[2]);
                    
                } 
                System.out.println("Successfully added "+inp[inp.length-1]); 
            }
            for(int i=0;i<inp.length-1;i++){
                if(inp[0]=="ADD" && inp[1]=="REPEATER" ){
                    arr.add(inp[1]);
                    arr.add(inp[2]);
                    
                } 
                System.out.println("Successfully added "+inp[inp.length-1]); 
            }
            //System.out.println(arr);
            

            
            //     if(inp[0]=="ADD"){
            //         hash.put(inp[1],inp[2]);
            //     }
            //     else if(inp[0]=="REPEATER"){
            //       hash.put(inp[1],inp[2]);
            //     }
            // System.out.println(hash);
            
            
              
        }
    }
}
