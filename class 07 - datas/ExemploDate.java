import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {


    public static void main(String[] args) {
        Date agora = new Date(); //takes the date of when the code is executed
        System.out.println("Agora: " + agora);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //here were formating the date to the standard form
        String dataFormatada = sdf.format(agora); //creating the string to get the value formated

        System.out.println("Data formatada: " + dataFormatada); //primted in formated way

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

        String dataFormatada2 = df.format(agora);
        System.out.println("Short format: " + dataFormatada2); //other way to print exact same way 

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Medium format: " + df.format(agora)); //showing month in a verbal way

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Long format: " + df.format(agora)); //showing the date in a very long way

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Full format: " + df.format(agora));

        
    }
}