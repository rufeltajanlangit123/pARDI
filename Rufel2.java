class Rufel2{
     static int width = 7;
     static int height = 5;
       
    
    public static void main (String []args){
      System.out.println("Perimeter of rectangle: " + displayPerimeter() + " inches");
      System.out.println("Area of the rectangle: " + displayArea() + " square inches");
      
    }

    public static int displayPerimeter(){
        int perimeter = 2 * (width + height);
        return perimeter;
        
    }
    
    public static int displayArea(){
        int area = height * width;
        return  area;
        
    }
    }