package ExerciciosFor;

public class Ex_14 {
    public static void main(String[] args) {

        for (int i = 2; i <= 50; i++) {
             boolean primo= true;
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                         primo = false;


                    }

                }
                if (primo){
                    System.out.println(i);
                }




        }



    }
}


