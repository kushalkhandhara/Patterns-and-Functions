class Pattern3{
    public static void main(String[] args){
        int rows = 4;
        for(int i = rows; i > 0; i--)
        {
            for(int j=i ; j>0 ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}