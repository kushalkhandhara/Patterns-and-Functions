public class Selection_Sort 
{
    public static void main(String[] args) 
    {
        int temp;
        int arr[] = {7,8,3,1,2};
        for(int i = 0; i <arr.length-1; i++) 
        {
            int smallest = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[smallest]) 
                {
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Print Array ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        

    }

    
}