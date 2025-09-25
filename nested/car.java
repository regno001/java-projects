package in.nested;

public class car {

    private int noOfdoors;

    public void repair(){
        tyre t = new tyre();
    }
    protected class tyre{
        private double Width;
        private double pressure;
        private  String material;

        public void inflate(){
        noOfdoors =4;
        }
    }

}
