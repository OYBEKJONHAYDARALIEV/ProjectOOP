package app_controller.oop.exception_handling;

import static app_controller.oop.dictionary_app.utility.DUtilityMethods.print;

public class UnCheckedExceptionTypes {

    public static void main(String[] args) {

//        int a = 45;
//        int b = 0;
//
//       try{
//           message(
//                   a / b
//           );
//       }catch (Exception e){
//           message("Sonni nolga bo'lib bo'lmaydi !!");
//       }

//        String str = null;
//
////        message(
////                str.toUpperCase()
////        );
//
//        String s = "";
//        String b = null;
//
//        message(s.toUpperCase());
//        message(b);


        int age = 59;

        if (age >= 18 && age <= 20){
            print("Xush kelibsiz");
        }else{

            throw new IncorrectAgeException("Yoshingiz to'g'ri kelmaydi");
        }


    }

}
