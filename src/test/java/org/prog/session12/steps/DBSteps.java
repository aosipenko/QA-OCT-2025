package org.prog.session12.steps;

import io.cucumber.java.en.Given;
import lombok.SneakyThrows;
import org.prog.session11.DataHolder;
import org.prog.session9.PersonDto;
import org.prog.session9.ResponseDto;

import java.sql.*;

public class DBSteps {

    public static Connection connection;

    @Given("I store {string} in database")
    public void storeRandomUsersInDB(String alias) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat) " +
                "VALUES (?, ?, ?, ?, ?)");
        ResponseDto responseDto = (ResponseDto) DataHolder.instance.get(alias);
        for (PersonDto personDto : responseDto.getResults()) {
            insertPerson(ps, personDto);
        }
    }

    @Given("I pick one random person from DB as {string}")
    public void pickRandomPersonFromDB(String alias) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(
                "select FirstName, LastName from Persons ORDER BY RAND() LIMIT 1");
        if (resultSet.next()) {
            String randomPersonFirstLastName = resultSet.getString("FirstName") + " "
                    + resultSet.getString("LastName");
            DataHolder.instance.put(alias, randomPersonFirstLastName);
        }

    }

    @SneakyThrows
    private void insertPerson(PreparedStatement ps, PersonDto personDto) {
        try {
            ps.setString(1, personDto.getName().getFirst());
            ps.setString(2, personDto.getName().getLast());
            ps.setString(3, personDto.getGender());
            ps.setString(4, personDto.getName().getTitle());
            ps.setString(5, personDto.getNat());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Failed to insert person: " + personDto);
        }
    }
}
