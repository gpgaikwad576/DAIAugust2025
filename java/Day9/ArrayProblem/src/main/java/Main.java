public class Main {
    public static void main(String [] args){
        boolean has=false;
        Array a1=new Array();

        Thread T1 =new Thread(new Runnable() {
            @Override
            public void run() {
                a1.print();


            }

        });


        boolean finalHas = !has;
        Thread T2 =new Thread(new Runnable() {

            @Override
            public void run() {
                if (!finalHas) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                a1.print();

            }


//                try{
//                    wait();
//                    for(int i=0;i<4;i++){
//                        a1.print(i);
//                    }
//
//                }
//                catch (InterruptedException e){
//                    System.out.print(" ");
//                }




        });

        T1.start();

        T2.start();
    }
}
