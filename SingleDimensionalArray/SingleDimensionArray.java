class SingleDimensionArray{
int [] arr;

public SingleDimensionArray(int size)
{
    arr = new int[size];

    for(int i = 0 ; i<arr.length; i++)
    {
        arr[i]  = Integer.MIN_VALUE;
    }
    
    
}


public void insertion(int index , int value)
{
    try{
        if(arr[index]==Integer.MIN_VALUE)
        {
            arr[index] = value;
            System.out.println("The value is inserted succesfully");
        }
        else{
            System.out.println("the block is already inserted");
        }
    }catch(Exception e)
    {
         System.out.println("Invalid index");
    }
}


public void traversal()
{
    for(int i = 0 ; i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
}


public int searching(int value)
{
     for(int i = 0 ; i<arr.length;i++)
    {
        if(arr[i]==value)
        {
            System.out.println("The value is present in the index of" + i);
            return 1;
        }
    }
    System.out.println("The value is not present");

    return 0;
}

public void deletion(int index)
{
    try{
        arr[index] = Integer.MIN_VALUE;
        System.out.println("The cell is deleted successfully");
    }
    catch(Exception e)
    {
        System.out.println("Invalid index");
    }
}






}