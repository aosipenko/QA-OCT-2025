package org.prog.session10.steps;

import io.cucumber.java.en.Given;
import lombok.SneakyThrows;
import org.prog.session9.PersonDto;
import org.prog.session9.ResponseDto;

import java.sql.*;

public class DBSteps {

    public static Connection connection;
    public static String randomPersonFirstLastName;

    @Given("I store these users in database")
    public void storeRandomUsersInDB() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat) " +
                "VALUES (?, ?, ?, ?, ?)");
        ResponseDto responseDto = RestApiSteps.randomPersons;
        for (PersonDto personDto : responseDto.getResults()) {
            insertPerson(ps, personDto);
        }
    }

    @Given("I pick one random person from DB")
    public void pickRandomPersonFromDB() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(
                "select FirstName, LastName from Persons ORDER BY RAND() LIMIT 1");
        if (resultSet.next()) {
            randomPersonFirstLastName = resultSet.getString("FirstName") + " "
                    + resultSet.getString("LastName");
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
