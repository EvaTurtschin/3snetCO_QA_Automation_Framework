package utils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider(name = "invalidEmail")
    public Iterator<Object[]> invalidEmail() throws IOException {
        List<Object[]> userData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("src/test/resources/emailinvalid.csv"))) {
            List<String[]> allRows = reader.readAll();
            for (String[] row : allRows) {
                if (row.length == 3) { // ensure that each row has exactly 3 elements
                    userData.add(new Object[]{row[0], row[1], row[2]});
                } else {
                    System.err.println("Invalid row format: " + String.join(",", row));
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw new IOException("Error reading CSV file", e);
        }
        return userData.iterator();
    }

    @DataProvider(name = "invalidPassword")
    public Iterator<Object[]> invalidPassword() throws IOException {
        List<Object[]> userData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("src/test/resources/passwordinvalid.csv"))) {
            List<String[]> allRows = reader.readAll();
            for (String[] row : allRows) {
                if (row.length == 3) { // ensure that each row has exactly 3 elements
                    userData.add(new Object[]{row[0], row[1], row[2]});
                } else {
                    System.err.println("Invalid row format: " + String.join(",", row));
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw new IOException("Error reading CSV file", e);
        }
        return userData.iterator();
    }

    @DataProvider(name = "invalidUsername")
    public Iterator<Object[]> invalidUsername() throws IOException {
        List<Object[]> userData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("src/test/resources/usernameinvalid.csv"))) {
            List<String[]> allRows = reader.readAll();
            for (String[] row : allRows) {
                if (row.length == 3) { // ensure that each row has exactly 3 elements
                    userData.add(new Object[]{row[0], row[1], row[2]});
                } else {
                    System.err.println("Invalid row format: " + String.join(",", row));
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw new IOException("Error reading CSV file", e);
        }
        return userData.iterator();
    }

    @DataProvider(name = "positiveRegistration")
    public Iterator<Object[]> positiveRegistration() throws IOException {
        List<Object[]> userData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("src/test/resources/userregistration.csv"))) {
            List<String[]> allRows = reader.readAll();
            for (String[] row : allRows) {
                if (row.length == 3) { // ensure that each row has exactly 3 elements
                    userData.add(new Object[]{row[0], row[1], row[2]});
                } else {
                    System.err.println("Invalid row format: " + String.join(",", row));
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw new IOException("Error reading CSV file", e);
        }
        return userData.iterator();
    }
}
