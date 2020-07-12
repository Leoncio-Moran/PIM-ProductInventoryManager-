package ec.edu.espe.filemanagerlibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * file creation and management
 *
 * @author DARIAN
 * @version 0.1.1
 * @since 2020-06-23
 */
public class FileManager {

    private static FileManager fileManager;

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (fileManager == null) {
            fileManager = new FileManager();
        }
        return fileManager;
    }

    /*
     * Write the data to a file
     * @param record: the data that I am going to save
     * @param fileName: the name of the file where I am going to work
     */
    public void writeRecord(String record, String fileName) throws IOException {
        BufferedWriter bw = openFileForWrite(fileName);
        bw.append(record);
        bw.append("\n");
        bw.close();
    }

    /*
     * Search a data in a file under a criterion
     * @param criteria: the search feature
     * @param column: in the column where I am going to do my search
     * @param fileName: the name of the file where I am going to work
     * @ returns a list of Strings
     */
    public List<String> findRecord(String criteria, int column, String fileName) throws IOException {
        List<String> listTemporal = new ArrayList<>();
        BufferedReader reader = openFileForRead(fileName);
        String currentLine = reader.readLine();
        while (currentLine != null) {
            String[] columns = currentLine.split(",");
            if (criteria.equalsIgnoreCase(columns[column])) {
                listTemporal.add(currentLine);
            }
            currentLine = reader.readLine();
        }
        return listTemporal;
    }

    /*
     * Lift the file and read it
     * @param fileName: the name of the file where I am going to work
     * @ returns a list of Strings
     */
    public ArrayList<String> read(String fileName) throws IOException {
        ArrayList<String> listTemporal = new ArrayList<>();
        BufferedReader reader = openFileForRead(fileName);
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            listTemporal.add(currentLine);
        }
        return listTemporal;
    }

    /* Write a list of Strings to a file
     * @param data: it is a list that I receive and write it to a file
     * @param fileName: the name of the file where I am going to work
     */
    public void write(List<String> data, String fileName) throws IOException {
        String tmp = data.toString();
        BufferedWriter bw = openFileForWrite(fileName);
        for (String item : data) {
            bw.append(item);
            bw.append("\n");
        }
        bw.close();
    }

    public void setName(String oldName, String newName) throws IOException {
        File file = new File(oldName);
        File file2 = new File(newName);

        if (file2.exists()) {
            throw new java.io.IOException("File exists");
        }
        boolean success = file.renameTo(file2);
        if (!success) {
            System.out.println("File was not successfully renamed");
        }
    }

    /* Create a file
     * @param fileName: the name of the file where I am going to work
     * @return a boolean
     */
    public boolean createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            return true;
        }
        return false;
    }

    /* Delete a file
     * @param fileName: the name of the file where I am going to work
     * @return a boolean
     */
    public boolean removeFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.delete()) {
            return true;
        }
        return false;
    }

    private void fileInitializer(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private BufferedReader openFileForRead(String fileName) throws IOException {
        fileInitializer(fileName);
        return new BufferedReader(new FileReader(fileName));
    }

    private BufferedWriter openFileForWrite(String fileName) throws IOException {
        fileInitializer(fileName);
        return new BufferedWriter(new FileWriter(fileName, true));
    }
}
