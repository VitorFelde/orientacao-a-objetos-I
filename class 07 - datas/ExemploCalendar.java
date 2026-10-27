import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        //creating an abstratct class, this basically allow us to created inheranced classes, like the gregorian calendar that we set down there
        Calendar agora = Calendar.getInstance(); //thats how we create an object of type calendar
        System.out.println("Agora: " + agora);

        Calendar dtVencimento = agora;
        dtVencimento.add(Calendar.DATE, 7); //messing in the date, and adding 7 days
        System.out.println("Data de vencimento: " + dtVencimento);
        
        dtVencimento.add(Calendar.MONTH, -1); //messing in the month, and subbing 1 month
        System.out.println("Data de vencimento: " + dtVencimento);

        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mês: " + gc.get(Calendar.MONTH));
        System.out.println("Dia do mes: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do mes: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana do ano: " + gc.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Dia da semana no mês: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hora: " + gc.get(Calendar.HOUR));
        System.out.println("AM/PM: " + gc.get(Calendar.AM_PM));
        System.out.println("Hora do dia (24h): " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
        System.out.println("Segundos: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data abreviada: " + df.format(gc.getTime()));
        System.out.println("Vencimento: " + dtVencimento.getTime());
        System.out.println("Vencimento formatado: " + df.format(dtVencimento.getTime()));
        

        System.out.println("Criando uma data específica:");
        GregorianCalendar dtNasc = new GregorianCalendar();
        dtNasc.set(2008, Calendar.MAY, 24);
        System.out.println("Data de nascimento: " + df.format(dtNasc.getTime()));    

        System.out.println("Craindo uma data a partir de uma String:");
        String dataString = "15/07/2025";
        String[] vetDataString = dataString.split("/");
        dtNasc.set(Calendar.YEAR, Integer.parseInt(vetDataString[2]));
        dtNasc.set(Calendar.MONTH, Integer.parseInt(vetDataString[1]) - 1); //-1 because month starts in 0
        dtNasc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetDataString[0]));
        System.out.println("Nova data: " + df.format(dtNasc.getTime()));

        dtNasc.set(Integer.parseInt(vetDataString[2]), Integer.parseInt(vetDataString[1]) - 1, Integer.parseInt(vetDataString[0]));
        
        System.out.println("Nova data: " + df.format(dtNasc.getTime()));

        

    }
}
