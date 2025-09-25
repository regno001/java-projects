package in.LiberaryItem;

public class LibTesting {
    public static void main(String[] args) {
        LiberaryItem lib = new LiberaryItem();
        book book =new book();
        dvd dvd = new dvd();
        magazines mag = new magazines();
        book.Checkout();
        System.out.println(book.Auther+book.Title+book.ItemID);
        dvd.returnItem();


    }
}
