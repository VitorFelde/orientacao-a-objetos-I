import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {


    public static void main(String[] args) {
        Date agora = new Date(); //takes the date of when the code is executed
        System.out.println("Agora: " + agora);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //here were formating the date to the standard form
        String dataFormatada = sdf.format(agora); //creating the string to get the value formated

        System.out.println("Data formatada: " + dataFormatada); //primted in formated way

        
    }
}