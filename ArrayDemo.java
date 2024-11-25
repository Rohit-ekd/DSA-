class ArrayDemo{
    // Display array
    public static void displayArr(int [] arr){
        for(int var:arr){
            System.out.print(var + " ");
        }
    }

    //search array element
   public static boolean searchEle(int [] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
   }

   //insert array element at particular index
   public static void insertEle(int [] arr, int idx, int y){
        int n = arr.length;
        int [] newarr = new int[n+1];
        if(idx!=-1 && idx<n+1){
            newarr[idx] = y;
            for(int i=0;i<idx;i++){
                newarr[i]=arr[i];
            }
            for(int i=idx+1 ;i<n+1;i++){
                newarr[i]=arr[i-1];
            }
        }
        displayArr(newarr);
   }

   // delete array element at particular index
//    public static void deleteEle(int[] arr, int y){
//     int idx = arr.index(y);

//    }

    public static void main(String [] args){
       int [] arr={1,2,0,9,5};
       System.out.println( searchEle(arr, 10));
       insertEle(arr, 5, 7);
    }
}