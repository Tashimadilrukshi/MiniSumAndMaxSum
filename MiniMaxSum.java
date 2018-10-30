import java.util.Scanner;

class MiniMaxSum{

  public static void main(String args[]){
    Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        System.out.println();
        
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
        }
        System.out.println();
        
        miniMaxSum(arr);
    }
    
  }


  public static void miniMaxSum(int[] arr) {
        
            int min=0, max=0; 
            int sum=0 ;
            
            for(int i=0; i<arr.length ; i++){
                sum+=arr[i];
            }
            
            for(int i=0; i<arr.length; i++){
                if(min>arr[i]){
                    min=arr[i];
                }  
            }
        
            for(int i=0; i<arr.length; i++){               
                if(max<arr[i]){
                    max=arr[i];
                }
            }
        
            int minSum,maxSum;
            
            minSum = sum - max;
            maxSum = sum - min;
            
        
            System.out.println(minSum+" "+maxSum);
        
      }
    
    }
