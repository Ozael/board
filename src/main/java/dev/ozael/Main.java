package dev.ozael;

import dev.ozael.persistence.migration.MigrationStrategy;
import dev.ozael.ui.MainMenu;

import java.sql.SQLException;

import static dev.ozael.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
