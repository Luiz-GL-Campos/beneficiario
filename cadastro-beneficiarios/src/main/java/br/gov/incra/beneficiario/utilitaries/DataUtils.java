package br.gov.incra.beneficiario.utilitaries;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class DataUtils {
    
    public DataUtils(){
        throw new UnsupportedOperationException("Esta classe utilitaria não pode ser instanciada.");
    }

    public static Long converterDataParaMilisegundo(LocalDate data){
        return data.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    public static Date converterLocalDateParaSQLDate(LocalDate data){
        return new Date(converterDataParaMilisegundo(data));
    }
}
