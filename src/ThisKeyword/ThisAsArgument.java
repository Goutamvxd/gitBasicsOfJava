package ThisKeyword;

 class ThisAsArgument {
    void m(ThisAsArgument obj){
        System.out.println("method is invoked");
    }
void p(){
m(this);
}

     public static void main(String[] args) {
         ThisAsArgument t1=new ThisAsArgument();
         t1.p();
     }
 }
