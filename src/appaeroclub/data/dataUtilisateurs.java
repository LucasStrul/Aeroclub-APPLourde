package appaeroclub.data;

import config.Connect;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class dataUtilisateurs extends Connect {

    PreparedStatement preparedStatement = null;
    Connection connection = dbConnection();

    public dataUtilisateurs() {
        this.connection = dbConnection();
    }

    
    public void insert(String login, String motdepasse) {
        try {
            String sql = "INSERT INTO MEMBRES (email, motdepasse) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, motdepasse);
            int rowsInserted = preparedStatement.executeUpdate();
               
            if (rowsInserted > 0) {
                System.out.println("Nouvel utilisateur inséré avec succès !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataUtilisateurs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public boolean verifUtilisateur(String login, String motdepasse) {
        try {
            String sql = "SELECT motdepasse FROM membres WHERE email = ? AND num_secu = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String hashedPasswordFromDB = resultSet.getString("motdepasse");

                if (BCrypt.checkpw(motdepasse, hashedPasswordFromDB)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataUtilisateurs.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
