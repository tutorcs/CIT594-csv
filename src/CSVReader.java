https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
import java.io.IOException;
import java.util.Arrays;

/**
 * {@code CSVReader} provides a stateful API for streaming individual CSV rows
 * as arrays of strings that have been read from a given CSV file.
 *
 * @author YOUR-NAME-HERE
 */
public class CSVReader {
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 5130490650040L;
    private final CharacterReader reader;

    public CSVReader(CharacterReader reader) {
        this.reader = reader;
    }

    /**
     * This method uses the class's {@code CharacterReader} to read in just enough
     * characters to process a single valid CSV row, represented as an array of
     * strings where each element of the array is a field of the row. If formatting
     * errors are encountered during reading, this method throws a
     * {@code CSVFormatException} that specifies the exact point at which the error
     * occurred.
     *
     * @return a single row of CSV represented as a string array, where each
     *         element of the array is a field of the row; or {@code null} when
     *         there are no more rows left to be read.
     * @throws IOException when the underlying reader encountered an error
     * @throws CSVFormatException when the CSV file is formatted incorrectly
     */
    public String[] readRow() throws IOException, CSVFormatException {
        return null;
    }

    /**
     * Feel free to edit this method for your own testing purposes. As given, it
     * simply processes the CSV file supplied on the command line and prints each
     * resulting array of strings to standard out. Any reading or formatting errors
     * are printed to standard error.
     *
     * @param args command line arguments (1 expected)
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: CSVReader <filename.csv>");
            return;
        }

        /*
         * This block of code demonstrates basic usage of CSVReader's row-oriented API:
         * initialize the reader inside try-with-resources, initialize the CSVReader
         * using the reader, and repeatedly call next() until null is encountered. Since
         * CharacterReader implements AutoCloseable, the reader will be automatically
         * closed once the try block is exited.
         */
        var filename = args[0];
        try (var reader = new CharacterReader(filename)) {
            var csvReader = new CSVReader(reader);
            String[] row;
            while ((row = csvReader.readRow()) != null) {
                System.out.println(Arrays.toString(row));
            }
        } catch (IOException | CSVFormatException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
