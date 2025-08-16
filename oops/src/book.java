class book {
    static
        int totalBooks;

    String title;
    String auther;
    String isbn;
    boolean isBorrowed;
    boolean isReturend;
  static {
      totalBooks =0;
  }
    {
        totalBooks++;
    }
book(String title,String auther,String isbn) {
this.isbn = isbn;
this.auther=auther;
this.title=title;
}
book(String isbn){
      this.isbn=isbn;

}
static int getTotalNoofBooks(){
      return totalBooks;
}
void borrowBook(){
      if (isBorrowed){
          System.out.println("Book is Already Borrowed");
      }else {
          this.isBorrowed = true;
          System.out.println("Enjoy the book" + this.title);
      }
      }
      void returned(){
      if(isBorrowed){
          this.isBorrowed=false;
          System.out.println("Please Review" );
      }else{
          System.out.println("This book is Already in the liberary");
      }
      }

    public static void main(String[] args) {
        book designOfThings = new book("Desing" ,"Author" , "1");
        book myBook = new book("Voldimort" ,"Author Singh" , "2");
        System.out.println(book.getTotalNoofBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returned();
        designOfThings.returned();
        System.out.println(myBook.auther);
        System.out.println(myBook.title);
        System.out.println(myBook.isbn);
  }
        }




