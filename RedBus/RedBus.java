class RedBus
{

        String[] arr;
    
        public RedBus(int numbersOfSeat) {
            arr = new String[numbersOfSeat];
    
            for (int i = 0; i < arr.length; i++) {
                arr[i] = "";  // or any other default string value you want
            }
        }



public void Booking(int seatNumber , String passengerName)
{
    try{
        if(arr[seatNumber ]=="")
        {
arr[seatNumber ] = passengerName;
System.out.println("the value is inserted succesfully");
        }
        else{
            System.out.println("the block is alreday inserted");
        }
    }
    catch(Exception e){
        System.out.println("Invalid index");
    }
}

public void Display()
{
    for(int i = 0 ; i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
}


public int Find(String passengerName)
{
    for(int i = 0 ; i<arr.length;i++)
    {
        if(arr[i].equals(passengerName))
        {
            System.out.println("The value is present in the Seat No " + i);
            return 1;
        }
    }
    System.out.println("The value is not present");

    return 0;
}


// public void CanceltheTicket(String passengerName)
// {
//     try{
//         arr[passengerName] = "";
//         System.out.println("The cell is deleted successfully");
//     }
//     catch(Exception e)
//     {
//         System.out.println("Invalid index");
//     }
// }



public void cancelTheTicket(String passengerName) {
    try {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(passengerName)) {
                arr[i] = "";
                System.out.println("The ticket for " + passengerName + " has been canceled successfully.");
                return;  
            }
        }
    
        System.out.println("Ticket cancellation failed. Passenger not found.");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid index");
    }
}


    }
    
