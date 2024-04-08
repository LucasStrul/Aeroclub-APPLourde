package logique;

import appaeroclub.metier.membres;
import appaeroclub.data.dataMembres;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class logiqueMembres {

    public String[] afficherMembre(int numMembre) {
        dataMembres membre = new dataMembres();
        membres unMembre = membre.selectMembres(numMembre);
        if (unMembre != null) {
            return unMembre.getMembreList();
        } else {
            return null;
        }
    }
    
    public void mettreAJourMembre(membres membre) {
        dataMembres dataMembre = new dataMembres();
        dataMembre.updateMembre(membre);
    }
    
    public void deleteMembre(int numMembre) {
        dataMembres dataMembre = new dataMembres();
        dataMembre.deleteMembre(numMembre);
    }
    
public DefaultTableModel getAllMembres() throws SQLException {
    dataMembres dataMembre = new dataMembres();
    DefaultTableModel model = dataMembre.getAllMembre();
    return model;  
}


}
