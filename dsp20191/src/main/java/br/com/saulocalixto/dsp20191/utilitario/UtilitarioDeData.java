package br.com.saulocalixto.dsp20191.utilitario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilitarioDeData {

    public static Date parseStringToDate(String date, String format) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            return formatter.parse(date);
        } catch (ParseException e) {
            System.err.println("Erro ao converter a data, digite-a no formato pedido 'dd/MM/yyyy'.");
        }
        return null;
    }

    public static String parseDataToString(Date data, String formato) {
        DateFormat dateFormat = new SimpleDateFormat(formato);
        return dateFormat.format(data);
    }

    public static String parseDataParaPersistir(Date data) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return dateFormat.format(data);
    }

    private static String getDiaFormatado(int dia) {
        if (dia >= 10) {
            return "" + dia;
        }
        return "0" + dia;
    }
}
