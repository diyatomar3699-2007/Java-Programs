public class singleton {
    class car{
        static car obj;
        String brandname;
        String model;
        String fueltype;
        String price;
           static car createInstance(String brandname,String model,String fueltype, String price){
            //here we will use if else
            // we will check if the object exist.
            //if the object exist we will return the old obj.
            //if the obj is not exist we will creste a new obj and return it.     
               if(obj==null){
                obj=new car(brandname, model, fueltype, price);
               }
               return obj;
           }

           car(String brandname,String model,String fueltype,String price){
            this.brandname=brandname;
            this.model=model;
            this.fueltype=fueltype;
            this.price=price;

           }
    }
    public static void main(String[] args) {
        car car1=car.newinstnce("honda","city","diesel","237");
        car car2= car.newinstnce("maruti","300","petrol","577");

    }
    
}
