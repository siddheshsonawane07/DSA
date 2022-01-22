package Bit_Manipulation;

public class bit_operations {

    static void getBit(int n, int k){
        //operation: bitmask AND number
         int bitmask = 1 << k;

        if((bitmask & n) == 0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is one");
        }
    }

    static int setKthBit(int n, int k)
    {
        //Set Bit
        //operation: bitmask OR number
        //Setting a bit means that if K-th bit is 0, then set it to 1 and if it is 1 then leave it unchanged.
        // kth bit of n is being set by this operation
        int bitmask = 1 << k;
        return (bitmask | n);
    }

    static int clearBit(int n, int k)
    {
        //Clear Bit
        //operation: number AND NOT bitmask
        //Clearing a bit means that if K-th bit is 1, then clear it to 0 and if it is 0 then leave it unchanged.
        // Function to clear the kth bit of n
        int bitmask = 1 << k;
        int negativebitmask = ~(bitmask);
        return (n & negativebitmask);
    }

    static int toggleBit(int oper, int n, int k)
    {
        //oper = 1 for setting the value to 1
        //oper = 0 for clearing the value to 0
        //also called as updating bit
        // Toggling a bit means that if K-th bit is 1, then change it to 0 and if it is 0 then change it to 1.
        // Function to toggle the kth bit of n
        //return (n ^ (1 << (k - 1)));

        int bitmask = 1 <<k;
        if(oper == 1){
            //setting the bit
            return (bitmask | n);
        }
        else if(oper == 0) {
            int negativebitmask = ~(bitmask);
            return (n & negativebitmask);
        }
        else{
            return -1;
    }
    }

    public static void main(String[] args) {


    }
}
