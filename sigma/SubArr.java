 class SubArr {
    public static void printSubarray(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print(" = "+sum);
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,8,2,14};
        printSubarray(arr);
    }
}