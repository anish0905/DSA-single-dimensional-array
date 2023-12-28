public class MainClass {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(5);

        sda.insertion(1,30);
        sda.insertion(0,40);
        sda.insertion(2,20);
        sda.insertion(3, 50);
        sda.insertion(4, 70);
        
        sda.traversal();

        sda.searching(100);


       sda.deletion(2);
    }
}
