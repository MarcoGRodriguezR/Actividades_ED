package prueba;

public class Signo {
    private int Mes, Dia;
    
    public Signo(int mes, int dia){
        if (mes < 1) {
            System.out.println("Mes no puede ser menor a 1, se usara 1");
            mes = 1;
        } else if (mes > 12) {
            System.out.println("Mes no puede ser mayor a 12, se usara 12");
            mes = 12;
        }
        Mes = mes;
        
        if (dia < 1){
            System.out.println("Valor menor que 1, se usara 1");
            dia = 1;
        } else if (mes == 2 && dia > 29) {
            System.out.println("No hay dia mayor a 29 en febrero, se usara 29");
            dia = 29;
        } else if ( ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31)) {
            System.out.println("No hay dia mayor a 31 en el mes " + mes + " se usara 31");
            dia = 31;
        } else if ( (mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("No hay dia mayor a 30 en el mes " + mes + " se usara 30");
            dia = 30;
        }
        Dia = dia;
    }
    
    public String ObtenerSigno(){
        // Acuario: 20 de enero al 18 de febrero
        if ((Mes == 1 && Dia >= 20) || (Mes == 2 && Dia <= 18)) {
            return "Acuario";
        }
        // Piscis: 19 de febrero al 20 de marzo
        if ((Mes == 2 && Dia >= 19) || (Mes == 3 && Dia <= 20)){
            return "Piscis";
        }
        // Aries: 21 de marzo al 19 de abril
        if ((Mes == 3 && Dia >= 21) || (Mes == 4 && Dia <= 19)){
            return "Aries";
        }
        // Tauro: 20 de abril al 20 de mayo
        if ((Mes == 4 && Dia >= 20) || (Mes == 5 && Dia <= 20)){
            return "Tauro";
        }
        // Géminis: 21 de mayo al 20 de junio
        if ((Mes == 5 && Dia >= 21) || (Mes == 6 && Dia <= 20)){
            return "Géminis";
        }
        // Cáncer: 21 de junio al 22 de julio
        if ((Mes == 6 && Dia >= 21) || (Mes == 7 && Dia <= 22)){
            return "Cáncer";
        }
        // Leo: 23 de julio al 22 de agosto
        if ((Mes == 7 && Dia >= 23) || (Mes == 8 && Dia <= 22)){
            return "Leo";
        }
        // Virgo: 23 de agosto al 22 de septiembre
        if ((Mes == 8 && Dia >= 23) || (Mes == 9 && Dia <= 22)){
            return "Virgo";
        }
        // Libra: 23 de septiembre al 22 de octubre
        if ((Mes == 9 && Dia >= 23) || (Mes == 10 && Dia <= 22)){
            return "Libra";
        }
        // Escorpio: 23 de octubre al 21 de noviembre
        if ((Mes == 10 && Dia >= 23) || (Mes == 11 && Dia <= 21)){
            return "Escorpio";
        }
        // Sagitario: 22 de noviembre al 21 de diciembre
        if ((Mes == 11 && Dia >= 22) || (Mes == 12 && Dia <= 21)){
            return "Sagitario";
        }
        // Capricornio: 22 de diciembre al 19 de enero
        if ((Mes == 12 && Dia >= 22) || (Mes == 1 && Dia <= 19)){
            return "Capricornio";
        }
        return "Error";
    }
}
