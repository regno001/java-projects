package in.LiberaryItem;

public class book extends LiberaryItem{
    private int ISBN;
    void book(){
        ItemID=122;
        Title="Amsterdamn";
        Auther="Ankita";
    }
    public void setISBN(int ISBN){
        System.out.printf("ISBN NO: %d",ISBN);
    }
}
