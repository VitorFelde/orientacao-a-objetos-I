public class Meses {
    String vetMeses[] = new String[12];

    //Metodo construtor
    //Executado automaticamente sempre que
    //se instancia um objeto de classe
    public Meses (){
        atribuirValores();
    }

    private void atribuirValores(){
        vetMeses[0] = "Janeiro";
        vetMeses[1] = "Fevereiro";
        vetMeses[2] = "Março";
        vetMeses[3] = "Abril";
        vetMeses[4] = "Maio";
        vetMeses[5] = "Junho";
        vetMeses[6] = "Julho";
        vetMeses[7] = "Agosto";
        vetMeses[8] = "Setembro";
        vetMeses[9] = "Outubro";
        vetMeses[10] = "Novembro";
        vetMeses[11] = "Dezembro";
    }

    public String pegaNomeMes(int num){
        if (num > 0 && num <= 12) {
            return vetMeses[num - 1];
        }else {
            return "";
        }
    }
}
