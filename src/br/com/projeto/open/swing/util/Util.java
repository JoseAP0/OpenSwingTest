package br.com.projeto.open.swing.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.util.java.Consts;

public class Util {
    
    private static Alerta objalert;
    
    public static Alerta getAlert(){
        
        if (objalert == null){
            objalert = new Alerta();
        }
        
        return objalert;
    }
    
    public static Map ajustaFiltro(Map filteredColumns) {

        Iterator it = filteredColumns.keySet().iterator();
        String attributeName = null;
        String auxiliar = "";

        while (it.hasNext()) {

            attributeName = it.next().toString();

            FilterWhereClause[] filtro = (FilterWhereClause[]) filteredColumns.get(attributeName);

            if (!filtro[0].getOperator().equals(Consts.IS_NOT_NULL) && !filtro[0].getOperator().equals(Consts.IS_NULL) && !(filtro[0].getValue() instanceof ArrayList)
                    && (filtro[0].getValue() == null || filtro[0].getValue().toString().equals("[]"))) {

                if (filtro[0].getOperator().equals(Consts.EQ)) {
                    filtro[0].setOperator(Consts.IS_NULL);
                } else if (filtro[0].getOperator().equals(Consts.NEQ)) {
                    filtro[0].setOperator(Consts.IS_NOT_NULL);
                } else {
                    filteredColumns.remove(attributeName);
                }

            } else if (filtro[0].getOperator() != null || !filtro[0].getOperator().trim().equals("")) {

                if (filtro[0].getOperator().trim().equalsIgnoreCase("ilike") || filtro[0].getOperator().trim().equalsIgnoreCase("like")) {

                    auxiliar = filtro[0].getValue().toString();

                    if (auxiliar.trim().equals("") || (!auxiliar.substring(0, 1).equals("%")
                            && !auxiliar.substring(auxiliar.length() - 1, auxiliar.length()).equals("%"))) {

                        auxiliar = "%" + auxiliar + "%";
                        filtro[0].setValue(auxiliar);
                        filteredColumns.put(attributeName, filtro);

                    }

                }
            }
        }

        return filteredColumns;

    }
}
